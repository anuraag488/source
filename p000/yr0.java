package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yr0 extends ue2 implements mq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ dp4 f35475i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ag1 f35476j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f35477k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ pg0 f35478l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr0(dp4 dp4Var, ag1 ag1Var, Object obj, pg0 pg0Var) {
        super(2);
        this.f35475i = dp4Var;
        this.f35476j = ag1Var;
        this.f35477k = obj;
        this.f35478l = pg0Var;
    }

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
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object objMo11188l;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Number) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            xr0 xr0Var = new xr0(this.f35476j);
            sq4 sq4Var = sw4.f30612a;
            dp4 dp4Var = this.f35475i;
            boolean zM4648j = dp4Var.m4648j();
            zh0 zh0Var = dp4Var.f17258a;
            i50 i50Var = ki0.f23136a;
            if (zM4648j) {
                ir1Var.m6885d0(1666827533);
                ir1Var.m6912r(false);
                objMo11188l = zh0Var.mo11188l();
            } else {
                ir1Var.m6885d0(1666573488);
                boolean zM6890g = ir1Var.m6890g(dp4Var);
                objMo11188l = ir1Var.m6869O();
                if (zM6890g || objMo11188l == i50Var) {
                    e94 e94VarM5353c0 = ev0.m5353c0();
                    yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                    e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                    try {
                        Object objMo11188l2 = zh0Var.mo11188l();
                        ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                        ir1Var.m6905n0(objMo11188l2);
                        objMo11188l = objMo11188l2;
                    } catch (Throwable th) {
                        ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                        throw th;
                    }
                }
                ir1Var.m6912r(false);
            }
            ir1Var.m6885d0(1378811975);
            Object obj3 = this.f35477k;
            float f = z62.m13387o(objMo11188l, obj3) ? 1.0f : 0.0f;
            ir1Var.m6912r(false);
            Float fValueOf = Float.valueOf(f);
            boolean zM6890g2 = ir1Var.m6890g(dp4Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g2 || objM6869O == i50Var) {
                hc0 hc0Var = new hc0((byte) 6);
                hc0Var.f20476b = dp4Var;
                VarHandle.storeStoreFence();
                objM6869O = s94.m10566b(hc0Var);
                ir1Var.m6905n0(objM6869O);
            }
            Object value = ((xb4) objM6869O).getValue();
            ir1Var.m6885d0(1378811975);
            float f2 = z62.m13387o(value, obj3) ? 1.0f : 0.0f;
            ir1Var.m6912r(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zM6890g3 = ir1Var.m6890g(dp4Var);
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6890g3 || objM6869O2 == i50Var) {
                hc0 hc0Var2 = new hc0((byte) 7);
                hc0Var2.f20476b = dp4Var;
                VarHandle.storeStoreFence();
                objM6869O2 = s94.m10566b(hc0Var2);
                ir1Var.m6905n0(objM6869O2);
            }
            bp4 bp4VarM13688t = zp0.m13688t(dp4Var, fValueOf, fValueOf2, (ag1) xr0Var.invoke(((xb4) objM6869O2).getValue(), ir1Var, 0), sq4Var, ir1Var, 0);
            boolean zM6890g4 = ir1Var.m6890g(bp4VarM13688t);
            Object objM6869O3 = ir1Var.m6869O();
            if (zM6890g4 || objM6869O3 == i50Var) {
                objM6869O3 = new C1183ti(bp4VarM13688t, (byte) 4);
                ir1Var.m6905n0(objM6869O3);
            }
            nt2 nt2VarM10693F = se0.m10693F(kt2.f23428a, (yp1) objM6869O3);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM10693F);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m85w(ir1Var, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            this.f35478l.invoke(obj3, ir1Var, 0);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
