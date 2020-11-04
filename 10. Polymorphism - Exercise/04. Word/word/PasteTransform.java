package word;

class PasteTransform implements TextTransform {
    private CutTransform cutTransform;

    public PasteTransform(CutTransform cutTransform) {
        this.cutTransform = cutTransform;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        text.replace(startIndex,endIndex, this.cutTransform.getLastCut().toString());
    }
    /*@Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        if (!cuts.isEmpty()) {
            if (startIndex == endIndex) {
                text.replace(startIndex, endIndex, cuts.peek());
            } else {
                for (int i = startIndex; i < endIndex; i++) {
                    text.replace(startIndex, endIndex, cuts.peek());
                }
            }
        }
    }*/
}

