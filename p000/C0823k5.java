package p000;

import ads_mobile_sdk.my3;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0823k5 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22891a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f22892b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22893c;

    public /* synthetic */ C0823k5(byte b) {
        this.f22891a = b;
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
        C0853kz c0853kz;
        C0853kz c0853kz2;
        byte b = this.f22891a;
        byte b2 = 0;
        ju4 ju4Var = ju4.f22634a;
        int i = 1;
        switch (b) {
            case 0:
                boolean z = this.f22892b;
                pg0 pg0Var = (pg0) this.f22893c;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lu2 lu2Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
                    p91 p91VarM7438c = k91.m7438c(lu2Var.mo7286c(), 2);
                    db4 db4VarMo7289f = lu2Var.mo7289f();
                    if ((14 & 1) != 0) {
                        Map map = wy4.f33864a;
                        db4VarMo7289f = qq2.m10014I(0.0f, 400.0f, w52.m12106a(4294967297L), 1);
                    }
                    C0816jz c0816jz = ig1.f21389m;
                    if (c0816jz.equals(ig1.f21387k)) {
                        c0853kz = ig1.f21379c;
                    } else {
                        c0853kz = c0816jz.equals(c0816jz) ? ig1.f21385i : ig1.f21382f;
                    }
                    p91 p91VarM9439a = p91VarM7438c.m9439a(new p91(new cp4((xc1) null, (t74) null, new z70(c0853kz, new C1035pi(i, (byte) 17), db4VarMo7289f, true), (rv3) null, (LinkedHashMap) null, 123)));
                    mc1 mc1VarM7439d = k91.m7439d(lu2Var.mo7286c(), 2);
                    db4 db4VarMo7289f2 = lu2Var.mo7289f();
                    if ((14 & 1) != 0) {
                        Map map2 = wy4.f33864a;
                        db4VarMo7289f2 = qq2.m10014I(0.0f, 400.0f, w52.m12106a(4294967297L), 1);
                    }
                    C0816jz c0816jz2 = ig1.f21389m;
                    if (c0816jz2.equals(ig1.f21387k)) {
                        c0853kz2 = ig1.f21379c;
                    } else {
                        c0853kz2 = c0816jz2.equals(c0816jz2) ? ig1.f21385i : ig1.f21382f;
                    }
                    mc1 mc1VarM8273a = mc1VarM7439d.m8273a(new mc1(new cp4((xc1) null, (t74) null, new z70(c0853kz2, new C1035pi(i, (byte) 18), db4VarMo7289f2, true), (rv3) null, (LinkedHashMap) null, 123)));
                    C0897m5 c0897m5 = new C0897m5(b2 == true ? 1 : 0);
                    c0897m5.f24664b = pg0Var;
                    VarHandle.storeStoreFence();
                    z62.m13374d(z, null, p91VarM9439a, mc1VarM8273a, null, vd6.m11834R(-1512021067, c0897m5, ir1Var), ir1Var, 1572864);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                nt2 nt2Var = (nt2) this.f22893c;
                boolean z2 = this.f22892b;
                ((Integer) obj2).getClass();
                AbstractC1030pd.m9495b(nt2Var, (mi0) obj, vd6.m11838V(1), z2 ? 1 : 0);
                return ju4Var;
            case 2:
                ((Integer) obj2).getClass();
                oh6.m9095a(this.f22892b, (wp1) this.f22893c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 3:
                ((Integer) obj2).getClass();
                gq6.m6080e(this.f22892b, (mq1) this.f22893c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 4:
                ((Integer) obj2).getClass();
                oh6.m9100f((pk4) this.f22893c, this.f22892b, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 5:
                ql3 ql3Var = (ql3) this.f22893c;
                boolean z3 = this.f22892b;
                ro0 ro0Var = (ro0) obj;
                po0 po0Var = (po0) obj2;
                if (!(po0Var instanceof my3)) {
                    return ro0Var.plus(po0Var);
                }
                ro0 ro0Var2 = (ro0) ql3Var.f28555a;
                q50 q50Var = my3.f7433b;
                if (ro0Var2.get(q50Var) == null) {
                    return ro0Var.plus(z3 ? new my3() : (my3) po0Var);
                }
                ql3Var.f28555a = ((ro0) ql3Var.f28555a).minusKey(q50Var);
                return ro0Var.plus(new my3());
            case 6:
                boolean z4 = this.f22892b;
                nv2 nv2Var = (nv2) this.f22893c;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zc6.m13518c(z4, null, nv2Var, ir1Var2, 48);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            default:
                u74 u74Var = (u74) this.f22893c;
                boolean z5 = this.f22892b;
                u31 u31Var = (u31) obj;
                a84 a84Var = a84.f165a;
                u31.m11222g0(u31Var, u74Var.m11271a(z5, true), u31Var.mo3575E(4.0f) / 2.0f, ((b33) obj2).f15059a, 120);
                return ju4Var;
        }
    }
}
