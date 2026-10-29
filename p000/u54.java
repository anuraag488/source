package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u54 implements d03 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ d64 f31660a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ w10 f31661b;

    @Override // p000.d03
    /* JADX INFO: renamed from: Q */
    public final long mo4257Q(long j, int i, long j2) {
        d63 d63Var = d63.f16814a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j2));
        if (i != 1 || fIntBitsToFloat == 0.0f) {
            return 0L;
        }
        C0940nb c0940nb = this.f31660a.f16820d;
        float fM8673k = c0940nb.m8673k(fIntBitsToFloat);
        float fM8675m = fM8673k - c0940nb.m8675m();
        ((C0903mb) c0940nb.f25614k).m8259a(fM8673k, 0.0f);
        return m11262a(fM8675m);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.d03
    /* JADX INFO: renamed from: R */
    public final Object mo4258R(long j, long j2, wm0 wm0Var) {
        s54 s54Var;
        if (wm0Var instanceof s54) {
            s54Var = (s54) wm0Var;
            int i = s54Var.f29924w;
            if ((i & Integer.MIN_VALUE) != 0) {
                s54Var.f29924w = i - Integer.MIN_VALUE;
            } else {
                s54Var = new s54(this, (ym0) wm0Var);
            }
        } else {
            s54Var = new s54(this, (ym0) wm0Var);
        }
        Object objM4384a = s54Var.f29922u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = s54Var.f29924w;
        if (i2 == 0) {
            k43.m7376J(objM4384a);
            d63 d63Var = d63.f16814a;
            float fM7333d = jx4.m7333d(j2);
            d64 d64Var = this.f31660a;
            w10 w10Var = this.f31661b;
            s54Var.f29921t = j;
            s54Var.f29924w = 1;
            objM4384a = d64Var.m4384a(w10Var, fM7333d, s54Var);
            if (objM4384a == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = s54Var.f29921t;
            k43.m7376J(objM4384a);
        }
        return jx4.m7330a(qs5.m10097b(jx4.m7332c(j), ((Number) objM4384a).floatValue()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.d03
    /* JADX INFO: renamed from: Z */
    public final Object mo4259Z(long j, wm0 wm0Var) {
        t54 t54Var;
        d64 d64Var = this.f31660a;
        C0940nb c0940nb = d64Var.f16820d;
        if (wm0Var instanceof t54) {
            t54Var = (t54) wm0Var;
            int i = t54Var.f30794w;
            if ((i & Integer.MIN_VALUE) != 0) {
                t54Var.f30794w = i - Integer.MIN_VALUE;
            } else {
                t54Var = new t54(this, (ym0) wm0Var);
            }
        } else {
            t54Var = new t54(this, (ym0) wm0Var);
        }
        Object obj = t54Var.f30792u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = t54Var.f30794w;
        if (i2 == 0) {
            k43.m7376J(obj);
            d63 d63Var = d63.f16814a;
            float fM7333d = jx4.m7333d(j);
            float fM8675m = c0940nb.m8675m();
            float fM11655e = c0940nb.m8670h().m11655e();
            if (fM7333d >= 0.0f || fM8675m <= fM11655e) {
                j = 0;
            } else {
                w10 w10Var = this.f31661b;
                t54Var.f30791t = j;
                t54Var.f30794w = 1;
                if (d64Var.m4384a(w10Var, fM7333d, t54Var) == ap0Var) {
                    return ap0Var;
                }
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = t54Var.f30791t;
            k43.m7376J(obj);
        }
        return jx4.m7330a(j);
    }

    /* JADX INFO: renamed from: a */
    public final long m11262a(float f) {
        d63 d63Var = d63.f16814a;
        d63 d63Var2 = d63.f16814a;
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // p000.d03
    /* JADX INFO: renamed from: p0 */
    public final long mo4260p0(int i, long j) {
        d63 d63Var = d63.f16814a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        C0940nb c0940nb = this.f31660a.f16820d;
        float fM8673k = c0940nb.m8673k(fIntBitsToFloat);
        float fM8675m = fM8673k - c0940nb.m8675m();
        ((C0903mb) c0940nb.f25614k).m8259a(fM8673k, 0.0f);
        return m11262a(fM8675m);
    }
}
