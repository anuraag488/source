package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f00 {

    /* JADX INFO: renamed from: a */
    public int f18622a;

    /* JADX INFO: renamed from: b */
    public int f18623b;

    /* JADX INFO: renamed from: c */
    public String f18624c;

    /* JADX INFO: renamed from: a */
    public static e00 m5438a() {
        e00 e00Var = new e00();
        e00Var.f17553b = 0;
        e00Var.f17554c = "";
        return e00Var;
    }

    public final String toString() {
        int i = this.f18622a;
        int i2 = qv5.f28836a;
        jm3 jm3Var = pr5.f27924c;
        Integer numValueOf = Integer.valueOf(i);
        return c75.m3879k("Response Code: ", (!jm3Var.containsKey(numValueOf) ? pr5.f27923b : (pr5) jm3Var.get(numValueOf)).toString(), ", Debug Message: ", this.f18624c);
    }
}
