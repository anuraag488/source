package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class pn2 {
    /* JADX INFO: renamed from: a */
    public void mo9587a(k44 k44Var, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(k44Var);
        sb.append(':');
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(" ");
        if (str2.length() > 0) {
            sb2.append("(" + str2 + ')');
            sb2.append(" ");
        }
        sb2.append(str);
        System.out.println((Object) sb2.toString());
        if (th != null) {
            th.printStackTrace();
        }
    }
}
