package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ay5 {
    /* JADX INFO: renamed from: a */
    public static String m3373a(ig6 ig6Var) {
        StringBuilder sb = new StringBuilder(ig6Var.mo3593d());
        for (int i = 0; i < ig6Var.mo3593d(); i++) {
            byte bMo3591b = ig6Var.mo3591b(i);
            if (bMo3591b == 34) {
                sb.append("\\\"");
            } else if (bMo3591b == 39) {
                sb.append("\\'");
            } else if (bMo3591b != 92) {
                switch (bMo3591b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo3591b < 32 || bMo3591b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo3591b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo3591b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo3591b & 7) + 48));
                        } else {
                            sb.append((char) bMo3591b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3374b(byte b) {
        return b > -65;
    }
}
