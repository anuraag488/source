package p000;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g34 {

    /* JADX INFO: renamed from: f */
    public static final double f19586f = Math.random();

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f19587g = 0;

    /* JADX INFO: renamed from: a */
    public hg1 f19588a;

    /* JADX INFO: renamed from: b */
    public sg1 f19589b;

    /* JADX INFO: renamed from: c */
    public s34 f19590c;

    /* JADX INFO: renamed from: d */
    public xa1 f19591d;

    /* JADX INFO: renamed from: e */
    public ro0 f19592e;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m5896a(ym0 ym0Var) {
        f34 f34Var;
        if (ym0Var instanceof f34) {
            f34Var = (f34) ym0Var;
            int i = f34Var.f18718w;
            if ((i & Integer.MIN_VALUE) != 0) {
                f34Var.f18718w = i - Integer.MIN_VALUE;
            } else {
                f34Var = new f34(this, ym0Var);
            }
        } else {
            f34Var = new f34(this, ym0Var);
        }
        Object obj = f34Var.f18716u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = f34Var.f18718w;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            k43.m7376J(obj);
            Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
            s34 s34Var = this.f19590c;
            f34Var.f18715t = this;
            f34Var.f18718w = 1;
            if (s34Var.m10517b(f34Var) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = f34Var.f18715t;
            k43.m7376J(obj);
        }
        s34 s34Var2 = this.f19590c;
        Boolean boolMo6660a = s34Var2.f29856a.mo6660a();
        if (boolMo6660a != null) {
            zBooleanValue = boolMo6660a.booleanValue();
        } else {
            Boolean boolMo6660a2 = s34Var2.f29857b.mo6660a();
            if (boolMo6660a2 != null) {
                zBooleanValue = boolMo6660a2.booleanValue();
            }
        }
        if (!zBooleanValue) {
            Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
            return Boolean.FALSE;
        }
        if (f19586f <= this.f19590c.m10516a()) {
            return Boolean.TRUE;
        }
        Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
        return Boolean.FALSE;
    }
}
