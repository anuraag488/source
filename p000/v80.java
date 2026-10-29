package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v80 extends y42 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f32455l = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ byte f32456k = 1;

    public final String toString() {
        switch (this.f32456k) {
            case 0:
                return "CharMatcher.none()";
            default:
                StringBuilder sb = new StringBuilder("CharMatcher.is('");
                char[] cArr = new char[6];
                cArr[0] = '\\';
                cArr[1] = 'u';
                cArr[2] = 0;
                cArr[3] = 0;
                cArr[4] = 0;
                cArr[5] = 0;
                int i = 10;
                int i2 = 0;
                while (i2 < 4) {
                    cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
                    i2++;
                    i = 0;
                }
                sb.append(String.copyValueOf(cArr));
                sb.append("')");
                return sb.toString();
        }
    }
}
