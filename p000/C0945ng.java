package p000;

import java.lang.invoke.VarHandle;
import java.util.HashMap;

/* JADX INFO: renamed from: ng */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0945ng implements a44 {

    /* JADX INFO: renamed from: a */
    public HashMap f25756a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xn2 f25757b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ zo0 f25758c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C1033pg f25759d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ lt0 f25760e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ i92 f25761f;

    @Override // p000.a44
    /* JADX INFO: renamed from: a */
    public final sw2 mo44a(String str, jc2 jc2Var) {
        HashMap map = this.f25756a;
        xn2 xn2Var = this.f25757b;
        zo0 zo0Var = this.f25758c;
        C1033pg c1033pg = this.f25759d;
        lt0 lt0Var = this.f25760e;
        i92 i92Var = this.f25761f;
        Object obj = map.get(str);
        Object obj2 = obj;
        if (obj == null) {
            C0908mg c0908mg = new C0908mg();
            c0908mg.f24872d = xn2Var;
            c0908mg.f24873e = zo0Var;
            c0908mg.f24874f = c1033pg;
            c0908mg.f24875g = lt0Var;
            c0908mg.f24876h = i92Var;
            c0908mg.f24869a = jc2Var;
            xd3 xd3Var = new xd3(str);
            c0908mg.f24870b = xd3Var;
            Object objM6525c = c1033pg.f27583a.m6525c(xd3Var);
            if (objM6525c == null) {
                objM6525c = null;
            } else if (!z62.m13387o(jc2Var.mo15d().mo4431c(), tf3.f31121r) && (objM6525c instanceof String)) {
                jc2 jc2Var2 = jc2Var;
                i92Var.getClass();
                dd4 dd4VarM13883r = zy5.m13883r(i92Var, (String) objM6525c);
                Object objMo6942b = new wc4(i92Var, bk2.OBJ, dd4VarM13883r, jc2Var2.mo15d()).mo6942b(jc2Var2);
                dd4VarM13883r.m7805p();
                objM6525c = objMo6942b;
            }
            d83 d83VarM7398w = k43.m7398w(objM6525c);
            c0908mg.f24871c = d83VarM7398w;
            if (xn2Var != null) {
                String strM12721a = xn2Var.m12721a();
                k44 k44Var = k44.f22883b;
                if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                    xn2Var.m12722b(k44Var, strM12721a, str + " initialize preference with " + d83VarM7398w.getValue(), null);
                }
            }
            VarHandle.storeStoreFence();
            map.put(str, c0908mg);
            obj2 = c0908mg;
        }
        return (sw2) obj2;
    }
}
