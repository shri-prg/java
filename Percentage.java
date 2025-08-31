class Percentage {
    public static void main(String[] args) {
        int p=66;int c=65;int m=76; int o=83;
        int marks = p + c + m + o;
        float totalMarks = 400F;
        double percentage = (marks / (double) totalMarks) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}