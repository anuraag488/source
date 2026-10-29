package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ju0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ boolean f22616A;

    /* JADX INFO: renamed from: t */
    public Serializable f22617t;

    /* JADX INFO: renamed from: u */
    public ol3 f22618u;

    /* JADX INFO: renamed from: v */
    public byte f22619v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ql3 f22620w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ru0 f22621x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ol3 f22622y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ mq1 f22623z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju0(ql3 ql3Var, ru0 ru0Var, ol3 ol3Var, mq1 mq1Var, boolean z, wm0 wm0Var) {
        super(1, wm0Var);
        this.f22620w = ql3Var;
        this.f22621x = ru0Var;
        this.f22622y = ol3Var;
        this.f22623z = mq1Var;
        this.f22616A = z;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        mq1 mq1Var = this.f22623z;
        boolean z = this.f22616A;
        return new ju0(this.f22620w, this.f22621x, this.f22622y, mq1Var, z, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r10 == r0) goto L29;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ql3 ql3Var;
        ol3 ol3Var;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f22619v;
        ol3 ol3Var2 = this.f22622y;
        ru0 ru0Var = this.f22621x;
        ql3 ql3Var2 = this.f22620w;
        try {
            if (b == 0) {
                k43.m7376J(obj);
                this.f22617t = ql3Var2;
                this.f22619v = (byte) 1;
                obj = ru0Var.m10434g(this);
                if (obj != ap0Var) {
                    ql3Var = ql3Var2;
                }
                return ap0Var;
            }
            if (b == 1) {
                ql3Var = (ql3) this.f22617t;
                k43.m7376J(obj);
            } else {
                if (b != 2) {
                    if (b != 3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ol3Var2 = this.f22618u;
                    k43.m7376J(obj);
                    ol3Var2.f26851a = ((Number) obj).intValue();
                    return ju4.f22634a;
                }
                ol3Var = (ol3) this.f22617t;
                k43.m7376J(obj);
            }
            ol3Var.f26851a = ((Number) obj).intValue();
            return ju4.f22634a;
            ql3Var.f28555a = obj;
            mq1 mq1Var = this.f22623z;
            Boolean boolValueOf = Boolean.valueOf(this.f22616A);
            this.f22617t = ol3Var2;
            this.f22619v = (byte) 2;
            obj = mq1Var.invoke(boolValueOf, this);
            if (obj == ap0Var) {
                return ap0Var;
            }
            ol3Var = ol3Var2;
            ol3Var.f26851a = ((Number) obj).intValue();
            return ju4.f22634a;
        } catch (gp0 unused) {
            Object obj2 = ql3Var2.f28555a;
            this.f22617t = null;
            this.f22618u = ol3Var2;
            this.f22619v = (byte) 3;
            obj = ru0Var.m10437j(obj2, true, this);
        }
    }
}
