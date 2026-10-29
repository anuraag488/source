package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w54 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f33110a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ lv1 f33111b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ d64 f33112c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ mq1 f33113d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ pg0 f33114e;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        boolean z = this.f33110a;
        lv1 lv1Var = this.f33111b;
        d64 d64Var = this.f33112c;
        mq1 mq1Var = this.f33113d;
        pg0 pg0Var = this.f33114e;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6871T = ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16);
        InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
        ju4 ju4Var = ju4.f22634a;
        if (!zM6871T) {
            ir1Var.m6874W();
            return ju4Var;
        }
        ir1Var.m6885d0(-1544932974);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = C0765il.f21523c;
            ir1Var.m6905n0(objM6869O);
        }
        kt2 kt2Var = kt2.f23428a;
        nt2 nt2VarM10327a = rf4.m10327a(kt2Var, ju4Var, (PointerInputEventHandler) objM6869O);
        if (z && lv1Var != null && !d64Var.f16820d.m8672j()) {
            boolean zM6890g = ir1Var.m6890g(d64Var) | ir1Var.m6890g(lv1Var);
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6890g || objM6869O2 == i50Var) {
                obj4 = objM6869O2;
                io0 io0Var = new io0((byte) 1);
                io0Var.f21604b = d64Var;
                io0Var.f21605c = lv1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(io0Var);
                obj4 = io0Var;
            }
            nt2VarM10327a = nt2VarM10327a.mo7630d(rf4.m10327a(kt2Var, d64Var, (PointerInputEventHandler) obj4));
        }
        ir1Var.m6912r(false);
        xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
        int iHashCode = Long.hashCode(ir1Var.f21683T);
        ga3 ga3VarM6902m = ir1Var.m6902m();
        nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM10327a);
        bi0.f15310ap.getClass();
        if (interfaceC0618en == null) {
            dt0.m4682E();
            throw null;
        }
        ir1Var.m6893h0();
        boolean z2 = ir1Var.f21682S;
        da2 da2Var = wf2.f33290T;
        if (z2) {
            ir1Var.m6900l(da2Var);
        } else {
            ir1Var.m6911q0();
        }
        jh0 jh0Var = ia5.f21216g;
        C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c);
        jh0 jh0Var2 = ia5.f21215f;
        C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m);
        Integer numValueOf = Integer.valueOf(iHashCode);
        jh0 jh0Var3 = ia5.f21217h;
        C0006a5.m53I(ir1Var, jh0Var3, numValueOf);
        C0006a5.m50F(ir1Var);
        jh0 jh0Var4 = ia5.f21214e;
        C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A);
        sw2 sw2VarM7369C = k43.m7369C(mq1Var.invoke(ir1Var, 0), ir1Var);
        Object objM6869O3 = ir1Var.m6869O();
        if (objM6869O3 == i50Var) {
            objM6869O3 = k43.m7398w(Boolean.FALSE);
            ir1Var.m6905n0(objM6869O3);
        }
        sw2 sw2Var = (sw2) objM6869O3;
        at1 at1Var = new at1((byte) 6);
        at1Var.f14855b = sw2Var;
        at1Var.f14856c = sw2VarM7369C;
        at1Var.f14857d = pg0Var;
        VarHandle.storeStoreFence();
        i25.m6609a(null, null, false, vd6.m11834R(-82196884, at1Var, ir1Var), ir1Var, 3072, 7);
        a05 a05Var = (a05) sw2VarM7369C.getValue();
        nc4 nc4Var = ij0.f21473h;
        ky0 ky0Var = (ky0) ir1Var.m6898k(nc4Var);
        nt2 nt2VarM8574b = n74.m8574b(n74.m8575c(kt2Var, ky0Var.mo3586w0(a05Var.mo10b(ky0Var))), 1.0f);
        xq2 xq2VarM9704c2 = q20.m9704c(ig1.f21382f, false);
        int iHashCode2 = Long.hashCode(ir1Var.f21683T);
        ga3 ga3VarM6902m2 = ir1Var.m6902m();
        nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var, nt2VarM8574b);
        ir1Var.m6893h0();
        if (ir1Var.f21682S) {
            ir1Var.m6900l(da2Var);
        } else {
            ir1Var.m6911q0();
        }
        C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c2);
        C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m2);
        d55.m4373r(iHashCode2, ir1Var, jh0Var3, ir1Var);
        C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A2);
        sw2 sw2VarM7369C2 = k43.m7369C(ir1Var.m6898k(nc4Var), ir1Var);
        Object objM6869O4 = ir1Var.m6869O();
        if (objM6869O4 == i50Var) {
            C1048pv c1048pv = new C1048pv((byte) 16);
            c1048pv.f28016b = d64Var;
            c1048pv.f28017c = sw2VarM7369C;
            c1048pv.f28018d = sw2VarM7369C2;
            VarHandle.storeStoreFence();
            objM6869O4 = s94.m10566b(c1048pv);
            ir1Var.m6905n0(objM6869O4);
        }
        boolean z3 = !((Boolean) sw2Var.getValue()).booleanValue() || ((Boolean) ((xb4) objM6869O4).getValue()).booleanValue();
        nc4 nc4Var2 = pq2.f27894b;
        p91 p91VarM7438c = k91.m7438c(((lq2) ir1Var.m6898k(nc4Var2)).f24280d.mo7286c(), 2);
        mc1 mc1VarM7439d = k91.m7439d(((lq2) ir1Var.m6898k(nc4Var2)).f24280d.mo7286c(), 2);
        x54 x54Var = new x54();
        x54Var.f34021a = z;
        VarHandle.storeStoreFence();
        z62.m13372c(z3, null, p91VarM7438c, mc1VarM7439d, null, vd6.m11834R(1794129636, x54Var, ir1Var), ir1Var, 196608);
        ir1Var.m6912r(true);
        ir1Var.m6912r(true);
        return ju4Var;
    }
}
