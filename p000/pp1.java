package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 implements sp1 {

    /* JADX INFO: renamed from: a */
    public d83 f27879a;

    /* JADX INFO: renamed from: b */
    public d83 f27880b;

    /* JADX INFO: renamed from: c */
    public b70 f27881c;

    /* JADX INFO: renamed from: d */
    public long f27882d;

    /* JADX INFO: renamed from: e */
    public boolean f27883e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ wp1 f27884f;

    @Override // p000.sp1
    /* JADX INFO: renamed from: a */
    public final boolean mo5771a() {
        return ((wm0) this.f27880b.getValue()) != null;
    }

    @Override // p000.sp1
    /* JADX INFO: renamed from: b */
    public final boolean mo5772b() {
        return ((Boolean) this.f27879a.getValue()).booleanValue();
    }

    @Override // p000.sp1
    /* JADX INFO: renamed from: c */
    public final Object mo5773c(of4 of4Var) {
        d83 d83Var = this.f27880b;
        if (((wm0) d83Var.getValue()) == null || i41.m6645d(((i41) this.f27884f.invoke()).f21121a, this.f27882d) < 0) {
            return Boolean.FALSE;
        }
        this.f27883e = false;
        byte b = 1;
        b70 b70Var = new b70(1, C0006a5.m86x(of4Var));
        b70Var.m3497u();
        this.f27881c = b70Var;
        wm0 wm0Var = (wm0) d83Var.getValue();
        if (wm0Var != null) {
            wm0Var.resumeWith(ju4.f22634a);
        }
        d83Var.setValue(null);
        op1 op1Var = new op1(b);
        op1Var.f26935b = this;
        VarHandle.storeStoreFence();
        b70Var.m3499w(op1Var);
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    /* JADX INFO: renamed from: d */
    public final Object m9597d(ip1 ip1Var, ym0 ym0Var) {
        np1 np1Var;
        if (ym0Var instanceof np1) {
            np1Var = (np1) ym0Var;
            int i = np1Var.f26013w;
            if ((i & Integer.MIN_VALUE) != 0) {
                np1Var.f26013w = i - Integer.MIN_VALUE;
            } else {
                np1Var = new np1(this, ym0Var);
            }
        } else {
            np1Var = new np1(this, ym0Var);
        }
        Object obj = np1Var.f26011u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = np1Var.f26013w;
        if (i2 == 0) {
            k43.m7376J(obj);
            np1Var.f26010t = ip1Var;
            np1Var.f26013w = 1;
            b70 b70Var = new b70(1, C0006a5.m86x(np1Var));
            b70Var.m3497u();
            this.f27880b.setValue(b70Var);
            op1 op1Var = new op1((byte) 0);
            op1Var.f26935b = this;
            VarHandle.storeStoreFence();
            b70Var.m3499w(op1Var);
            if (b70Var.m3495r() == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ip1Var = np1Var.f26010t;
            k43.m7376J(obj);
        }
        ip1Var.invoke();
        return ju4.f22634a;
    }
}
