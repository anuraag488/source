package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uu0 {

    /* JADX INFO: renamed from: b */
    public static final vq0 f32170b = new vq0();

    /* JADX INFO: renamed from: c */
    public static final String f32171c = m11648a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: d */
    public static final String f32172d = m11648a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: e */
    public static final nm0 f32173e = new nm0((byte) 8);

    /* JADX INFO: renamed from: a */
    public zn3 f32174a;

    /* JADX INFO: renamed from: a */
    public static String m11648a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            C1077qn.m9987m("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
