package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class hd0 {

    /* JADX INFO: renamed from: a */
    public static final id0 f20482a = new id0(AbstractC1337xn.f34436c, ig1.f21390n);

    /* JADX INFO: renamed from: a */
    public static final id0 m6333a(InterfaceC1299wn interfaceC1299wn, C0779iz c0779iz, mi0 mi0Var, int i) {
        if (interfaceC1299wn.equals(AbstractC1337xn.f34436c) && c0779iz.equals(ig1.f21390n)) {
            ir1 ir1Var = (ir1) mi0Var;
            ir1Var.m6885d0(-1446604504);
            ir1Var.m6912r(false);
            return f20482a;
        }
        ir1 ir1Var2 = (ir1) mi0Var;
        ir1Var2.m6885d0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ir1Var2.m6890g(interfaceC1299wn)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ir1Var2.m6890g(c0779iz)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM6869O = ir1Var2.m6869O();
        if (z3 || objM6869O == ki0.f23136a) {
            objM6869O = new id0(interfaceC1299wn, c0779iz);
            ir1Var2.m6905n0(objM6869O);
        }
        id0 id0Var = (id0) objM6869O;
        ir1Var2.m6912r(false);
        return id0Var;
    }
}
