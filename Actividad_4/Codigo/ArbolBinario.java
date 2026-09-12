package Actividad_4.Codigo;

public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    // ===== FASE 1: INSERCIÓN =====
    public void insertar(int d) {
        // TODO: implementa la inserción en un ABB.
        if (raiz == null) {
            raiz = new Nodo(d);
        } else if (d < raiz.getDato()) {
            raiz.setIzq(insertarRec(raiz.getIzq(), d));
        } else if (d > raiz.getDato()) {
            raiz.setDer(insertarRec(raiz.getDer(), d));
        }

    }

    private Nodo insertarRec(Nodo n, int d) {
        // TODO: si n es null crea un Nodo(d) y devuélvelo.
        if (n == null) {
            return new Nodo(d);
        } else if (d < n.getDato()) {
            n.setIzq(insertarRec(n.getIzq(), d));
        } else if (d > n.getDato()) {
            n.setDer(insertarRec(n.getDer(), d));
        }
        return n;
    }

    // ===== FASE 2: RECORRIDOS =====
    public String inorden() {
        // TODO: recorre en inorden (izq, nodo, der) y devuelve los valores
        // separados por coma, ej: "1,3,5,9". Usa el helper inordenRec.
        StringBuilder sb = new StringBuilder();
        inordenRec(raiz, sb);
        return sb.toString();
    }

    private void inordenRec(Nodo n, StringBuilder sb) {
        // TODO: agrega un valor y una coma (si ya hay algo) y recursiona.
        if (n == null) {
            return;
        }
        inordenRec(n.getIzq(), sb);
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(n.getDato());
        inordenRec(n.getDer(), sb);
    }

    public String preorden() {
        // TODO: recorrido preorden (nodo, izq, der) separado por comas.
        StringBuilder sb = new StringBuilder();
        preordenRec(raiz, sb);
        return sb.toString();
    }

    private void preordenRec(Nodo n, StringBuilder sb) {
        // TODO
        if (n == null) {
            return;
        }

        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(n.getDato());
        preordenRec(n.getIzq(), sb);
        preordenRec(n.getDer(), sb);
    }

    public String postorden() {
        // TODO: recorrido postorden (izq, der, nodo) separado por comas.
        StringBuilder sb = new StringBuilder();
        postordenRec(raiz, sb);
        return sb.toString();
    }

    private void postordenRec(Nodo n, StringBuilder sb) {
        // TODO
        if (n == null) {
            return;
        }

        postordenRec(n.getIzq(), sb);
        postordenRec(n.getDer(), sb);
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(n.getDato());
    }

    // ===== FASE 3: BÚSQUEDA =====
    public boolean buscar(int d) {
        // TODO: devuelve true si el valor existe en el árbol.
        if (raiz == null) {
            return false;
        }
        return buscarRec(raiz, d);
    }

    private boolean buscarRec(Nodo n, int d) {
        // TODO: búsqueda binaria recursiva.
        if (n == null) {
            return false;
        } else if (d < n.getDato()) {
            return buscarRec(n.getIzq(), d);
        } else if (d > n.getDato()) {
            return buscarRec(n.getDer(), d);
        } else {
            return true;
        }
    }

    public String claseNodo(int d) {
        // TODO: usa buscarNodo(raiz, d) para localizar el nodo que contiene d
        // y devuelve su clasificación: "RAIZ", "HOJA", "UN_HIJO",
        // "DOS_HIJOS" o "NO_EXISTE".
        Nodo nodo = buscarNodo(raiz, d);
        if (nodo == null) {
            return "NO_EXISTE";
        } else if (nodo == raiz) {
            return "RAIZ";
        } else if (nodo.getIzq() == null && nodo.getDer() == null) {
            return "HOJA";
        } else if (nodo.getIzq() == null || nodo.getDer() == null) {
            return "UN_HIJO";
        } else {
            return "DOS_HIJOS";
        }
    }

    private Nodo buscarNodo(Nodo n, int d) {
        // TODO: busca el nodo que contiene d (búsqueda binaria recursiva)
        // y devuélvelo, o null si no existe.
        if (n == null) {
            return null;
        } else if (d < n.getDato()) {
            return buscarNodo(n.getIzq(), d);
        } else if (d > n.getDato()) {
            return buscarNodo(n.getDer(), d);
        } else {
            return n;
        }
    }

    // ===== FASE 4: ELIMINACIÓN =====
    public boolean eliminar(int d) {
        // TODO: elimina el valor d del árbol si existe.
        // Devuelve true si lo encontró y eliminó, false si no existía.
        // Uso: raiz = eliminarRec(raiz, d); return encontrado(o false).
        boolean encontrado = buscar(d);
        if (raiz == null) {
            return false;
        }
        if (!encontrado) {
            return false;
        }
        raiz = eliminarRec(raiz, d);
        return true;
    }

    private Nodo eliminarRec(Nodo n, int d) {
        // TODO: los 3 casos:
        // - HOJA: devuelve null.
        // - UN hijo: devuelve ese hijo.
        // - DOS hijos: reemplaza por el mínimo del subárbol derecho
        // (sucesor inorden) y elimina ese sucesor.
        if (n == null) {
            return null;
        } else if (d < n.getDato()) {
            n.setIzq(eliminarRec(n.getIzq(), d));
        } else if (d > n.getDato()) {
            n.setDer(eliminarRec(n.getDer(), d));
        } else {
            if (n.getIzq() == null && n.getDer() == null) {
                return null;
            } else if (n.getIzq() == null) {
                n = n.getDer();
            } else if (n.getDer() == null) {
                n = n.getIzq();
            } else {
                Nodo minimo = minimo(n.getDer());
                n.setDato(minimo.getDato());
                n.setDer(eliminarRec(n.getDer(), minimo.getDato()));
            }
        }
        return n;
    }

    private Nodo minimo(Nodo n) {
        // TODO: devuelve el nodo con el valor más pequeño del subárbol.
        if (n == null) {
            return null;
        }
        while (n.getIzq() != null) {
            n = n.getIzq();
        }
        return n;
    }

}
