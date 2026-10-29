package p000;

import ads_mobile_sdk.rc2;
import android.net.Network;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k31 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22841t;

    /* JADX INFO: renamed from: u */
    public boolean f22842u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f22843v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f22844w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f22845x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k31(long j, Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f22841t = b;
        this.f22843v = j;
        this.f22844w = obj;
        this.f22845x = obj2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f22841t;
        Object obj2 = this.f22845x;
        switch (b) {
            case 0:
                k31 k31Var = new k31((l31) obj2, this.f22843v, wm0Var);
                k31Var.f22844w = obj;
                return k31Var;
            case 1:
                return new k31(this.f22844w, this.f22843v, obj2, wm0Var, (byte) 1);
            case 2:
                return new k31(this.f22843v, this.f22844w, obj2, wm0Var, (byte) 2);
            case 3:
                return new k31(this.f22843v, this.f22844w, obj2, wm0Var, (byte) 3);
            case 4:
                return new k31(this.f22844w, this.f22843v, obj2, wm0Var, (byte) 4);
            default:
                return new k31(this.f22844w, this.f22843v, obj2, wm0Var, (byte) 5);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22841t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((k31) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((k31) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((k31) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((k31) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((k31) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((k31) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Object objM8325a;
        byte b = this.f22841t;
        long j = this.f22843v;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f22845x;
        byte b2 = 1;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f22842u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                zo0 zo0Var = (zo0) this.f22844w;
                nq1 nq1Var = ((l31) obj2).f23758L;
                b33 b33VarM3423a = b33.m3423a(j);
                this.f22842u = true;
                return nq1Var.invoke(zo0Var, b33VarM3423a, this) == ap0Var ? ap0Var : ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f22842u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                xb4 xb4Var = (xb4) this.f22844w;
                by2 by2Var = new by2(b2);
                by2Var.f15683b = xb4Var;
                VarHandle.storeStoreFence();
                vt0 vt0VarM10013H = qq2.m10013H(by2Var);
                C1405zh c1405zh = new C1405zh(j, null, (sw2) obj2);
                this.f22842u = true;
                return sj3.m10820p(vt0VarM10013H, c1405zh, this) == ap0Var2 ? ap0Var2 : ju4Var;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f22842u;
                if (!z3) {
                    k43.m7376J(obj);
                    this.f22842u = true;
                    if (d24.m4318s(j, this) == ap0Var3) {
                        return ap0Var3;
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                sw2 sw2Var = (sw2) this.f22844w;
                nc4 nc4Var = ze3.f36022a;
                sw2Var.setValue(Boolean.FALSE);
                ((sw2) obj2).setValue(i41.m6644c(0L));
                return ju4Var;
            case 3:
                o54 o54Var = (o54) this.f22844w;
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f22842u;
                if (!z4) {
                    k43.m7376J(obj);
                    if (i41.m6645d(j, 0L) > 0) {
                        this.f22842u = true;
                        if (d24.m4318s(j, this) == ap0Var4) {
                            return ap0Var4;
                        }
                    }
                } else {
                    if (!z4) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                if (o54Var.f26354a != 0) {
                    return ju4Var;
                }
                zi0 zi0Var = o54Var.f26355b;
                if (zi0Var != null) {
                    zi0Var.mo8488a();
                }
                o54Var.f26355b = null;
                o54Var.f26357d.setValue(qw3.f28853d);
                wp1 wp1Var = (wp1) obj2;
                if (wp1Var == null) {
                    return ju4Var;
                }
                wp1Var.invoke();
                return ju4Var;
            case 4:
                l74 l74Var = (l74) obj2;
                j74 j74Var = (j74) this.f22844w;
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f22842u;
                if (!z5) {
                    k43.m7376J(obj);
                    C0910mi c0910mi = j74Var.f22077a;
                    w52 w52VarM12106a = w52.m12106a(j);
                    InterfaceC1407zj interfaceC1407zj = l74Var.f23835o;
                    this.f22842u = true;
                    objM8325a = C0910mi.m8325a(c0910mi, w52VarM12106a, interfaceC1407zj, null, this, 12);
                    if (objM8325a == ap0Var5) {
                        return ap0Var5;
                    }
                } else {
                    if (!z5) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                    objM8325a = obj;
                }
                EnumC1258vj enumC1258vj = ((C1333xj) objM8325a).f34311b;
                EnumC1258vj enumC1258vj2 = EnumC1258vj.f32656a;
                return ju4Var;
            default:
                ap0 ap0Var6 = ap0.f14763a;
                boolean z6 = this.f22842u;
                if (!z6) {
                    k43.m7376J(obj);
                    this.f22842u = true;
                    return ((rc2) this.f22844w).m2100a(this.f22843v, (Network) obj2, null, false, this) == ap0Var6 ? ap0Var6 : ju4Var;
                }
                if (z6) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(l31 l31Var, long j, wm0 wm0Var) {
        super(2, wm0Var);
        this.f22841t = (byte) 0;
        this.f22845x = l31Var;
        this.f22843v = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k31(Object obj, long j, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f22841t = b;
        this.f22844w = obj;
        this.f22843v = j;
        this.f22845x = obj2;
    }
}
