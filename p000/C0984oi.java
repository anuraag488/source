package p000;

import java.util.Map;

/* JADX INFO: renamed from: oi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0984oi extends ue2 implements mq1 {

    /* JADX INFO: renamed from: j */
    public static final C0984oi f26753j;

    /* JADX INFO: renamed from: k */
    public static final C0984oi f26754k;

    /* JADX INFO: renamed from: l */
    public static final C0984oi f26755l;

    /* JADX INFO: renamed from: m */
    public static final C0984oi f26756m;

    /* JADX INFO: renamed from: n */
    public static final C0984oi f26757n;

    /* JADX INFO: renamed from: o */
    public static final C0984oi f26758o;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f26759i;

    static {
        int i = 2;
        f26753j = new C0984oi(i, (byte) 0);
        f26754k = new C0984oi(i, (byte) 1);
        f26755l = new C0984oi(i, (byte) 2);
        f26756m = new C0984oi(i, (byte) 3);
        f26757n = new C0984oi(i, (byte) 4);
        f26758o = new C0984oi(i, (byte) 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0984oi(int i, byte b) {
        super(i);
        this.f26759i = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        boolean z = false;
        switch (this.f26759i) {
            case 0:
                long j = ((w52) obj).f33109a;
                return kl0.m7531a(((kl0) obj2).f23210a);
            case 1:
                long j2 = ((w52) obj).f33109a;
                long j3 = ((kl0) obj2).f23210a;
                int i = (int) (j2 >> 32);
                int i2 = (int) (j2 & 4294967295L);
                if (!((i >= 0) & (i2 >= 0))) {
                    s32.m10514a("width and height must be >= 0");
                }
                return kl0.m7531a(ll0.m8016h(i, i, i2, i2));
            case 2:
                long j4 = ((w52) obj).f33109a;
                long j5 = ((w52) obj2).f33109a;
                Map map = wy4.f33864a;
                return qq2.m10014I(0.0f, 400.0f, w52.m12106a(4294967297L), 1);
            case 3:
                b91 b91Var = (b91) obj2;
                if (((b91) obj) == b91Var && b91Var == b91.f15170c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                jl3 jl3Var = (jl3) obj;
                float f = jl3Var.f22397b;
                float f2 = jl3Var.f22399d;
                float fFloatValue = Float.valueOf(b33.m3428f(((jl3) obj2).m7167c())).floatValue();
                if (fFloatValue >= f && fFloatValue < f2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                jl3 jl3Var2 = (jl3) obj;
                float f3 = jl3Var2.f22396a;
                float f4 = jl3Var2.f22398c;
                float fFloatValue2 = Float.valueOf(b33.m3427e(((jl3) obj2).m7167c())).floatValue();
                if (fFloatValue2 >= f3 && fFloatValue2 < f4) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
