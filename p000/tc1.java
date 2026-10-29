package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class tc1 {

    /* JADX INFO: renamed from: a */
    public static final sc1 f31068a = new sc1();

    /* JADX INFO: renamed from: b */
    public static final sc1 f31069b;

    static {
        ph3 ph3Var = ph3.f27607c;
        sc1 sc1Var = null;
        try {
            sc1Var = (sc1) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f31069b = sc1Var;
    }
}
