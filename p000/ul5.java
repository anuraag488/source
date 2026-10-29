package p000;

import ads_mobile_sdk.C0313rh;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ul5 implements w33 {

    /* JADX INFO: renamed from: a */
    public tt1 f31974a;

    /* JADX INFO: renamed from: b */
    public short f31975b;

    /* JADX INFO: renamed from: c */
    public C0458al f31976c;

    /* JADX INFO: renamed from: d */
    public long f31977d;

    /* JADX INFO: renamed from: e */
    public long f31978e;

    /* JADX INFO: renamed from: a */
    public static qk0 m11583a(ol5 ol5Var, AbstractC1235ux abstractC1235ux, int i) {
        qk0 telemetryConfiguration = abstractC1235ux.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f28535e) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f28537g;
        int i2 = 0;
        if (iArr != null) {
            while (i2 < iArr.length) {
                if (iArr[i2] != i) {
                    i2++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f28539i;
        if (iArr2 != null) {
            while (i2 < iArr2.length) {
                if (iArr2[i2] == i) {
                    return null;
                }
                i2++;
            }
        }
        if (ol5Var.f26867l < telemetryConfiguration.f28538h) {
            return telemetryConfiguration;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a A[PHI: r9
  0x008a: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x0088, B:44:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.w33
    public final void onComplete(nr6 nr6Var) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        if (this.f31974a.m11135a()) {
            br3 br3Var = (br3) ar3.m3127r().f14813b;
            if (br3Var == null || br3Var.f15525e) {
                ol5 ol5Var = (ol5) this.f31974a.f31420j.get(this.f31976c);
                if (ol5Var != null) {
                    Object obj = ol5Var.f26857b;
                    if (obj instanceof AbstractC1235ux) {
                        AbstractC1235ux abstractC1235ux = (AbstractC1235ux) obj;
                        int i5 = 0;
                        boolean z = this.f31977d > 0;
                        int gCoreServiceId = abstractC1235ux.getGCoreServiceId();
                        int i6 = 100;
                        if (br3Var != null) {
                            z &= br3Var.f15526f;
                            int i7 = br3Var.f15527g;
                            int i8 = br3Var.f15528h;
                            i = br3Var.f15524d;
                            if (abstractC1235ux.hasConnectionInfo() && !abstractC1235ux.isConnecting()) {
                                qk0 qk0VarM11583a = m11583a(ol5Var, abstractC1235ux, this.f31975b);
                                if (qk0VarM11583a == null) {
                                    return;
                                }
                                boolean z2 = qk0VarM11583a.f28536f && this.f31977d > 0;
                                i8 = qk0VarM11583a.f28538h;
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        tt1 tt1Var = this.f31974a;
                        int iElapsedRealtime = -1;
                        if (nr6Var.m8826j()) {
                            i4 = 0;
                        } else if (nr6Var.f26060d) {
                            i5 = i6;
                            i4 = -1;
                        } else {
                            Exception excM8823g = nr6Var.m8823g();
                            if (excM8823g instanceof C1334xk) {
                                Status status = ((C1334xk) excM8823g).f34324a;
                                i6 = status.f16228d;
                                lk0 lk0Var = status.f16231g;
                                if (lk0Var == null) {
                                    i5 = i6;
                                    i4 = -1;
                                } else {
                                    i4 = lk0Var.f24097e;
                                    i5 = i6;
                                }
                            } else {
                                i5 = C0313rh.f10756T0;
                                i4 = -1;
                            }
                        }
                        if (z) {
                            long j3 = this.f31977d;
                            long j4 = this.f31978e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        xs2 xs2Var = new xs2(this.f31975b, i5, i4, j, j2, null, null, gCoreServiceId, iElapsedRealtime);
                        tt1Var.getClass();
                        vl5 vl5Var = new vl5();
                        vl5Var.f32728a = xs2Var;
                        vl5Var.f32729b = i;
                        vl5Var.f32730c = i3;
                        vl5Var.f32731d = i2;
                        VarHandle.storeStoreFence();
                        km5 km5Var = tt1Var.f31423m;
                        km5Var.sendMessage(km5Var.obtainMessage(18, vl5Var));
                    }
                }
            }
        }
    }
}
