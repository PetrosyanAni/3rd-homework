public class Arrays {
    public static void main(String[] args) {
        int[] a = {5, -2, -3, 6, -7, 11};
        int[] b = new int[a.length];

        if (a[0] > 0) {
            b[0] = a[0];
        } else {
            if (a[1] > 0) {
                b[0] = a[1];
            } else {
                if (a[2] > 0) {
                    b[0] = a[2];
                } else {
                    if (a[3] > 0) {
                        b[0] = a[3];
                    } else {
                        if (a[4] > 0) {
                            b[0] = a[4];
                        } else {
                            if (a[5] > 0) {
                                b[0] = a[5];
                            }
                        }
                    }
                }
            }
        }
        if ((a[1] > 0) && (b[0] != a[1])) {
            b[1] = a[1];
        } else {
            if ((a[2] > 0) && (b[0] != a[2])) {
                b[1] = a[2];
            } else {
                if ((a[3] > 0) && (b[0] != a[3])) {
                    b[1] = a[3];
                } else {
                    if ((a[4] > 0) && (b[0] != a[4])) {
                        b[1] = a[4];
                    } else {
                        if ((a[5] > 0) && (b[0] != a[5])) {
                            b[1] = a[5];
                        }
                    }
                }
            }
        }
        if ((a[2] > 0) && (b[0] != a[2]) && (b[1] != a[2])) {
            b[2] = a[2];
        } else {
            if ((a[3] > 0) && (b[0] != a[3]) && (b[1] != a[3])) {
                b[2] = a[3];
            } else {
                if ((a[4] > 0) && (b[0] != a[4]) && (b[1] != a[4])) {
                    b[2] = a[4];
                } else {
                    if ((a[5] > 0) && (b[0] != a[2]) && (b[1] != a[5])) {
                        b[2] = a[5];
                    }
                }
            }
        }
        if ((a[3] > 0) && (b[0] != a[3]) && (b[1] != a[3]) && (b[2] != a[3])) {
            b[3] = a[3];
        } else {
            if ((a[4] > 0) && (b[0] != a[4]) && (b[1] != a[4]) && (b[2] != a[4])) {
                b[3] = a[4];
            } else {
                if ((a[5] > 0) && (b[0] != a[5]) && (b[1] != a[5]) && (b[2] != a[5])) {
                    b[3] = a[5];
                }
            }
        }
        if ((a[4] > 0) && (b[0] != a[4]) && (b[1] != a[4]) && (b[2] != a[4]) && (b[3] != a[4])) {
            b[4] = a[4];
        } else {
            if ((a[5] > 0) && (b[0] != a[5]) && (b[1] != a[5]) && (b[2] != a[5]) && (b[3] != a[5])) {
                b[4] = a[5];
            }
        }
        if ((a[5] > 0) && (b[0] != a[5]) && (b[1] != a[5]) && (b[2] != a[5]) && (b[3] != a[5]) && (b[4] != a[5])) {
            b[5] = a[5];
        }
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println(b[5]);
    }
}


