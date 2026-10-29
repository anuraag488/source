package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class yv0 {

    /* JADX INFO: renamed from: a */
    public static final mx0 f35546a;

    static {
        String property;
        yu1 yu1Var;
        mx0 mx0Var;
        int i = ph4.f27610a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            pw0 pw0Var = l01.f23664a;
            yu1Var = mp2.f25111a;
            yu1 yu1Var2 = yu1Var.f35531e;
            if (yu1Var == null) {
                mx0Var = yu1Var;
                mx0Var = xv0.f34637i;
            }
        } else {
            mx0Var = xv0.f34637i;
        }
        mx0Var = yu1Var;
        f35546a = mx0Var;
    }
}
