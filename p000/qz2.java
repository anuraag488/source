package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qz2 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28900a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pg0 f28901b;

    public /* synthetic */ qz2(byte b) {
        this.f28900a = b;
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
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        byte b = this.f28900a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                yp1 yp1Var = (yp1) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6894i(yp1Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    pg0 pg0Var = this.f28901b;
                    boolean z = (iIntValue & 14) == 4;
                    Object objM6869O = ir1Var.m6869O();
                    if (z || objM6869O == ki0.f23136a) {
                        obj4 = objM6869O;
                        C0898m6 c0898m6 = new C0898m6((byte) 4);
                        c0898m6.f24677b = yp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0898m6);
                        obj4 = c0898m6;
                    }
                    obj4 = objM6869O;
                    pg0Var.invoke((wp1) obj4, ir1Var, 0);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            default:
                vk3 vk3Var = (vk3) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(vk3Var) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18) {
                    ir1 ir1Var2 = (ir1) mi0Var2;
                    if (ir1Var2.m6858D()) {
                        ir1Var2.m6874W();
                        return ju4Var;
                    }
                }
                AbstractC0696gp abstractC0696gp = (AbstractC0696gp) vk3Var.f32702b.f24254q.getValue();
                if (abstractC0696gp instanceof C0620ep) {
                    ir1 ir1Var3 = (ir1) mi0Var2;
                    ir1Var3.m6887e0(1739512213);
                    ir1Var3.m6912r(false);
                } else {
                    if (abstractC0696gp instanceof C0659fp) {
                        ir1 ir1Var4 = (ir1) mi0Var2;
                        ir1Var4.m6887e0(1739605461);
                        qs5.f28772e.mo183g(vk3Var, abstractC0696gp, ir1Var4, Integer.valueOf((iIntValue2 & 14) | 64));
                        ir1Var4.m6912r(false);
                        return ju4Var;
                    }
                    if (abstractC0696gp instanceof C0582dp) {
                        ir1 ir1Var5 = (ir1) mi0Var2;
                        ir1Var5.m6887e0(1739696601);
                        this.f28901b.mo183g(vk3Var, abstractC0696gp, ir1Var5, Integer.valueOf((iIntValue2 & 14) | 64));
                        ir1Var5.m6912r(false);
                        return ju4Var;
                    }
                    if (!(abstractC0696gp instanceof C0546cp)) {
                        ir1 ir1Var6 = (ir1) mi0Var2;
                        ir1Var6.m6887e0(-82435959);
                        ir1Var6.m6912r(false);
                        C0670g.m5864c();
                        return null;
                    }
                    ir1 ir1Var7 = (ir1) mi0Var2;
                    ir1Var7.m6887e0(1739782316);
                    ir1Var7.m6912r(false);
                }
                oh6.m9103i(vk3Var, null, null, null, null, 0.0f, null, false, mi0Var2, iIntValue2 & 14, 255);
                return ju4Var;
        }
    }
}
