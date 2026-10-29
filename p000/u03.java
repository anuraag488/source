package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class u03 {

    /* JADX INFO: renamed from: a */
    public static final t03 f31578a;

    /* JADX INFO: renamed from: b */
    public static final t03 f31579b;

    static {
        ph3 ph3Var = ph3.f27607c;
        t03 t03Var = null;
        try {
            t03Var = (t03) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f31578a = t03Var;
        f31579b = new t03();
    }
}
