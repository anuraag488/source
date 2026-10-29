package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class or3 {

    /* JADX INFO: renamed from: a */
    public static final pr3 f26994a = new pr3(AbstractC1337xn.f34434a, ig1.f21387k);

    /* JADX INFO: renamed from: a */
    public static final pr3 m9243a(InterfaceC1188tn interfaceC1188tn, C0816jz c0816jz, mi0 mi0Var, int i) {
        if (interfaceC1188tn.equals(AbstractC1337xn.f34434a) && z62.m13387o(c0816jz, ig1.f21387k)) {
            ir1 ir1Var = (ir1) mi0Var;
            ir1Var.m6885d0(-1073830487);
            ir1Var.m6912r(false);
            return f26994a;
        }
        ir1 ir1Var2 = (ir1) mi0Var;
        ir1Var2.m6885d0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ir1Var2.m6890g(interfaceC1188tn)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ir1Var2.m6890g(c0816jz)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM6869O = ir1Var2.m6869O();
        if (z3 || objM6869O == ki0.f23136a) {
            objM6869O = new pr3(interfaceC1188tn, c0816jz);
            ir1Var2.m6905n0(objM6869O);
        }
        pr3 pr3Var = (pr3) objM6869O;
        ir1Var2.m6912r(false);
        return pr3Var;
    }
}
