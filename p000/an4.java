package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class an4 extends nw3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public long f14643f;

    @Override // p000.AbstractC1165t0, p000.e92
    /* JADX INFO: renamed from: W */
    public final String mo3053W() {
        return super.mo3053W() + "(timeMillis=" + this.f14643f + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        ro0 ro0Var = this.f30702d;
        d24.m4321v(ro0Var);
        vo0 vo0Var = (vo0) ro0Var.get(vo0.f32759c);
        String str = vo0Var != null ? vo0Var.f32760b : null;
        String string = "Timed out waiting for " + this.f14643f + " ms";
        if (str != null) {
            StringBuilder sbM10844j = sk5.m10844j("Coroutine \"", str, "\" ");
            if (string.length() > 0) {
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
            }
            sbM10844j.append(string);
            string = sbM10844j.toString();
        }
        m5008x(new zm4(string, this));
    }
}
