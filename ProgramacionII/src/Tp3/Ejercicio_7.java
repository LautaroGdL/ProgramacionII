package Tp3;

public class Ejercicio_7 {

    class EditorTexto {
        private java.util.Stack<String> undoStack = new java.util.Stack<>();
        private java.util.Stack<String> redoStack = new java.util.Stack<>();
        private String content = "";

        public void type(String text) {
            undoStack.push(content);
            content += text;
            redoStack.clear();
        }

        public void undo() {
            if (!undoStack.isEmpty()) {
                redoStack.push(content);
                content = undoStack.pop();
            }
        }

        public void redo() {
            if (!redoStack.isEmpty()) {
                undoStack.push(content);
                content = redoStack.pop();
            }
        }

        public String getContent() {
            return content;
        }
    }


}
