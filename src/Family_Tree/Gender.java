package Family_Tree;

public enum Gender {

        Man("Man"),
        Woman("Woman");

        private String translation;

        Gender(String translation) {
            this.translation = translation;
        }

        public String getTranslation() {
            return translation;
        }

}
