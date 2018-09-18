public class StudentsMarks<T> {

    T invalidOp = (T) "invalid input";

    public T validateInput(Object[]args) {
        try {

            if(args instanceof String[] || args instanceof Integer[]) {
                int[] data = convertStringtoInt(args);
                double[] studentGrades = new double[data[0]];
                int j = 0;
                for (int i = 1; i < args.length; i++) {
                    if (data[i] < 0 || data[i] > 100) {
                        throw new Exception("invalid input");
                    } else {
                        studentGrades[j++] = data[i];
                        continue;
                    }
                }
            }

            if(args instanceof Double[]){

                double data[]=convertargsToDouble(args);
                double[] studentGrades = new double[(int)data[0]];
                int j = 0;
                for (int i = 1; i < args.length; i++) {
                    if (data[i] < 0 || data[i] > 100) {
                        throw new Exception("invalid input");
                    } else {
                        studentGrades[j++] = data[i];
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            return invalidOp;
        }

return (T)"successfully Saved";
    }

    public int[] convertStringtoInt(Object[] arr) {

        int[] intarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intarr[i] = Integer.parseInt(arr[i] + "");
        }
        return intarr;
    }
    public double[] convertargsToDouble(Object[] arr) {

        double[] intarr = new double[(int)arr.length];
        for (int i = 0; i < arr.length; i++) {
            intarr[i] = Double.parseDouble(arr[i] + "");
        }
        return intarr;
    }


}
