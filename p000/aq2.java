package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq2 {

    /* JADX INFO: renamed from: a */
    public static final zp2 f14775a;

    /* JADX INFO: renamed from: b */
    public static final zp2 f14776b;

    static {
        ph3 ph3Var = ph3.f27607c;
        zp2 zp2Var = null;
        try {
            zp2Var = (zp2) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f14775a = zp2Var;
        f14776b = new zp2();
    }
}
