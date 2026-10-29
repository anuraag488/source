package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ti */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1183ti extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f31182i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f31183j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1183ti(Object obj, byte b) {
        super(1);
        this.f31182i = b;
        this.f31183j = obj;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f31182i;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f31183j;
        switch (b) {
            case 0:
                return Boolean.valueOf(z62.m13387o(obj, obj2));
            case 1:
                cb3 cb3Var = (cb3) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    cb3Var.m3952k((db3) arrayList.get(i), 0, 0, 0.0f);
                }
                return ju4Var;
            case 2:
                C0615ek c0615ek = (C0615ek) obj;
                float f = c0615ek.f18146b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = c0615ek.f18147c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = c0615ek.f18148d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = c0615ek.f18145a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return pb0.m9462a(pb0.m9463b(zy5.m13867c(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, oc0.f26570x), (lc0) obj2));
            case 3:
                return Boolean.valueOf(!z62.m13387o(obj, ((dp4) obj2).f17261d.getValue()));
            case 4:
                ((jp3) obj).m7253b(((Number) ((xb4) obj2).getValue()).floatValue());
                return ju4Var;
            case 5:
                u31 u31Var = (u31) obj;
                bu1 bu1Var = (bu1) obj2;
                C0489bf c0489bf = bu1Var.f15619l;
                if (bu1Var.f15621n && bu1Var.f15606A && c0489bf != null) {
                    jp0 jp0VarMo7035J = u31Var.mo7035J();
                    long jM7219E = jp0VarMo7035J.m7219E();
                    jp0VarMo7035J.m7248w().mo6253j();
                    try {
                        ((jp0) ((ar3) jp0VarMo7035J.f22481b).f14813b).m7248w().mo6262s(c0489bf);
                        bu1Var.m3686c(u31Var);
                    } finally {
                        d55.m4374s(jp0VarMo7035J, jM7219E);
                    }
                } else {
                    bu1Var.m3686c(u31Var);
                }
                return ju4Var;
            case 6:
                return Integer.valueOf(qs5.m10111p((Float) ((l73) obj).f23833a, (Float) obj2));
            case 7:
                ((sw2) obj2).setValue(b33.m3423a(((cf2) obj).mo4005S(0L)));
                return ju4Var;
            default:
                return Boolean.valueOf(((qn3) obj).f28622a.f25846a != ((qn3) obj2).f28622a.f25846a);
        }
    }
}
