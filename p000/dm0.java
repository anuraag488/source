package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dm0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f17177A;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f17178t = 0;

    /* JADX INFO: renamed from: u */
    public boolean f17179u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f17180v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f17181w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f17182x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f17183y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f17184z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm0(tb3 tb3Var, String str, long j, ql4 ql4Var, pk4 pk4Var, vi3 vi3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f17181w = tb3Var;
        this.f17182x = str;
        this.f17180v = j;
        this.f17183y = ql4Var;
        this.f17184z = pk4Var;
        this.f17177A = vi3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f17178t;
        Object obj2 = this.f17177A;
        Object obj3 = this.f17184z;
        Object obj4 = this.f17183y;
        Object obj5 = this.f17182x;
        switch (b) {
            case 0:
                dm0 dm0Var = new dm0((iv4) obj5, (fm0) obj4, (k30) obj3, this.f17180v, (t82) obj2, wm0Var);
                dm0Var.f17181w = obj;
                return dm0Var;
            default:
                return new dm0((tb3) this.f17181w, (String) obj5, this.f17180v, (ql4) obj4, (pk4) obj3, (vi3) obj2, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17178t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((dm0) create((wm0) obj2, (ty3) obj)).invokeSuspend(ju4Var);
            default:
                return ((dm0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7921b0;
        byte b = this.f17178t;
        Object obj2 = this.f17183y;
        Object obj3 = this.f17184z;
        Object obj4 = this.f17182x;
        Object obj5 = this.f17177A;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                k30 k30Var = (k30) obj3;
                fm0 fm0Var = (fm0) obj2;
                iv4 iv4Var = (iv4) obj4;
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f17179u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ty3 ty3Var = (ty3) this.f17181w;
                iv4Var.f21829e = fm0Var.m5739O0(k30Var, this.f17180v);
                C1164t c1164t = new C1164t((byte) 8);
                c1164t.f30700c = fm0Var;
                c1164t.f30699b = (t82) obj5;
                c1164t.f30701d = ty3Var;
                VarHandle.storeStoreFence();
                C1048pv c1048pv = new C1048pv((byte) 5);
                c1048pv.f28016b = fm0Var;
                c1048pv.f28017c = iv4Var;
                c1048pv.f28018d = k30Var;
                VarHandle.storeStoreFence();
                this.f17179u = true;
                return iv4Var.m6946a(c1164t, c1048pv, this) == ap0Var ? ap0Var : ju4Var;
            default:
                vi3 vi3Var = (vi3) obj5;
                String str = (String) obj4;
                pk4 pk4Var = (pk4) obj3;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f17179u;
                if (!z2) {
                    k43.m7376J(obj);
                    tb3 tb3Var = (tb3) this.f17181w;
                    this.f17179u = true;
                    tb3Var.getClass();
                    if (str.length() == 0) {
                        objM7921b0 = null;
                    } else {
                        long j = this.f17180v;
                        if (ql4.m9900d(j)) {
                            objM7921b0 = null;
                        } else {
                            objM7921b0 = lb5.m7921b0(tb3Var.f31053a, new C1312wz(tb3Var, new sb3(j, null, tb3Var, str), (wm0) null), this);
                        }
                    }
                    if (objM7921b0 == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                    objM7921b0 = obj;
                }
                ql4 ql4Var = (ql4) objM7921b0;
                if (ql4Var == null) {
                    return ju4Var;
                }
                long j2 = ql4Var.f28558a;
                int i = (int) (j2 >> 32);
                vi3Var.m11899b(i);
                int i2 = (int) (j2 & 4294967295L);
                vi3Var.m11899b(i2);
                long jM10657b = sc6.m10657b(i, i2);
                if (ql4.m9898b(jM10657b, (ql4) obj2) || !z62.m13387o(pk4Var.m9550l().f34341a.f24092b, str) || vi3Var != pk4Var.f27694b) {
                    return ju4Var;
                }
                pk4Var.f27695c.invoke(pk4.m9539b(pk4Var.m9550l().f34341a, jM10657b));
                pk4Var.f27714v = ql4.m9897a(jM10657b);
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm0(iv4 iv4Var, fm0 fm0Var, k30 k30Var, long j, t82 t82Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f17182x = iv4Var;
        this.f17183y = fm0Var;
        this.f17184z = k30Var;
        this.f17180v = j;
        this.f17177A = t82Var;
    }
}
