package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class g80 extends d80 {

    /* JADX INFO: renamed from: d */
    public final si1 f19653d;

    public g80(int i, y30 y30Var, ro0 ro0Var, si1 si1Var) {
        super(ro0Var, i, y30Var);
        this.f19653d = si1Var;
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: c */
    public final Object mo3886c(mg3 mg3Var, wm0 wm0Var) {
        Object objMo5915i = mo5915i(new z14(mg3Var), wm0Var);
        return objMo5915i == ap0.f14763a ? objMo5915i : ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093 A[RETURN] */
    @Override // p000.d80, p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) throws Throwable {
        Object objCollect;
        if (this.f16849b == -3) {
            ro0 context = wm0Var.getContext();
            Boolean bool = Boolean.FALSE;
            en0 en0Var = new en0((byte) 8);
            ro0 ro0Var = this.f16848a;
            ro0 ro0VarPlus = !((Boolean) ro0Var.fold(en0Var, bool)).booleanValue() ? context.plus(ro0Var) : c20.m3820o(context, ro0Var, false);
            if (z62.m13387o(ro0VarPlus, context)) {
                Object objMo5915i = mo5915i(ti1Var, wm0Var);
                if (objMo5915i == ap0.f14763a) {
                    return objMo5915i;
                }
            } else {
                gb5 gb5Var = gb5.f19711b;
                if (z62.m13387o(ro0VarPlus.get(gb5Var), context.get(gb5Var))) {
                    ro0 context2 = wm0Var.getContext();
                    boolean z = ti1Var instanceof z14;
                    n14 n14Var = dm4.f17190b;
                    wm0 wm0Var2 = null;
                    if (!z && !(ti1Var instanceof r13)) {
                        C0012ab c0012ab = new C0012ab((byte) 5);
                        c0012ab.f226b = context2;
                        c0012ab.f227c = context2.fold(n14Var, 0);
                        c0012ab.f228d = new vp4(ti1Var, wm0Var2, (byte) 3);
                        VarHandle.storeStoreFence();
                        ti1Var = c0012ab;
                    }
                    Object objM4702d0 = dt0.m4702d0(ro0VarPlus, ti1Var, ro0VarPlus.fold(n14Var, 0), new C0594e0((Object) this, wm0Var2, (byte) 14), wm0Var);
                    if (objM4702d0 == ap0.f14763a) {
                        return objM4702d0;
                    }
                } else {
                    objCollect = super.collect(ti1Var, wm0Var);
                    if (objCollect == ap0.f14763a) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(ti1Var, wm0Var);
            if (objCollect == ap0.f14763a) {
                return objCollect;
            }
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: i */
    public Object mo5915i(ti1 ti1Var, wm0 wm0Var) {
        Object objCollect = this.f19653d.collect(ti1Var, wm0Var);
        return objCollect == ap0.f14763a ? objCollect : ju4.f22634a;
    }

    @Override // p000.d80
    public final String toString() {
        return this.f19653d + " -> " + super.toString();
    }
}
