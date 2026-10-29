package p000;

import android.os.Looper;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: nc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0941nc extends xq1 implements wp1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f25629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0941nc(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f25629b = b;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x015c A[LOOP:4: B:73:0x012c->B:83:0x015c, LOOP_END] */
    @Override // p000.wp1
    public final Object invoke() throws Exception {
        C0940nb c0940nb;
        byte b;
        byte b2 = this.f25629b;
        byte b3 = 7;
        ju4 ju4Var = ju4.f22634a;
        Object obj = this.receiver;
        switch (b2) {
            case 0:
                boolean z = false;
                View view = (View) obj;
                view.setImportantForContentCapture(1);
                ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
                if (contentCaptureSession == null) {
                    return null;
                }
                nh3 nh3Var = new nh3(b3, z);
                nh3Var.f25810b = contentCaptureSession;
                nh3Var.f25811c = view;
                VarHandle.storeStoreFence();
                return nh3Var;
            case 1:
                ((zq0) obj).getClass();
                return Boolean.valueOf(hd4.m6335a0(Thread.currentThread().getName(), "Firebase Background Thread #", false));
            case 2:
                ((zq0) obj).getClass();
                return Boolean.valueOf(hd4.m6335a0(Thread.currentThread().getName(), "Firebase Blocking Thread #", false));
            case 3:
                ((zq0) obj).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 4:
                return ((ej4) obj).mo5136y0();
            case 5:
                xk1 xk1Var = (xk1) obj;
                mw2 mw2Var = xk1Var.f34329c;
                mw2 mw2Var2 = xk1Var.f34330d;
                bl1 bl1Var = xk1Var.f34327a;
                sl1 sl1VarM3620f = bl1Var.m3620f();
                if (sl1VarM3620f == null) {
                    Object[] objArr = mw2Var2.f25258b;
                    long[] jArr = mw2Var2.f25257a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << b3) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                int i3 = 0;
                                while (i3 < i2) {
                                    if ((j & 255) < 128) {
                                        ((nk1) objArr[(i << 3) + i3]).mo7995Y(nl1.f25929c);
                                    }
                                    j >>= 8;
                                    i3++;
                                    b3 = b3;
                                }
                                b = b3;
                                if (i2 == 8) {
                                }
                            } else {
                                b = b3;
                            }
                            if (i != length) {
                                i++;
                                b3 = b;
                            }
                        }
                    }
                } else if (sl1VarM3620f.f25208n) {
                    if (mw2Var.m8411c(sl1VarM3620f)) {
                        sl1VarM3620f.m10859U0();
                    }
                    nl1 nl1VarM10858T0 = sl1VarM3620f.m10858T0();
                    if (!sl1VarM3620f.f25195a.f25208n) {
                        q32.m9721c("visitAncestors called on an unattached node");
                    }
                    mt2 mt2Var = sl1VarM3620f.f25195a;
                    wf2 wf2VarM10652X = sc6.m10652X(sl1VarM3620f);
                    int i4 = 0;
                    while (wf2VarM10652X != null) {
                        if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 5120) != 0) {
                            while (mt2Var != null) {
                                int i5 = mt2Var.f25197c;
                                if ((i5 & 5120) != 0) {
                                    if ((i5 & 1024) != 0) {
                                        i4++;
                                    }
                                    if ((mt2Var instanceof nk1) && mw2Var2.m8411c(mt2Var)) {
                                        if (i4 <= 1) {
                                            ((nk1) mt2Var).mo7995Y(nl1VarM10858T0);
                                        } else {
                                            ((nk1) mt2Var).mo7995Y(nl1.f25928b);
                                        }
                                        mw2Var2.m8420l(mt2Var);
                                    }
                                }
                                mt2Var = mt2Var.f25199e;
                            }
                        }
                        wf2VarM10652X = wf2VarM10652X.m12295v();
                        mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
                    }
                    Object[] objArr2 = mw2Var2.f25258b;
                    long[] jArr2 = mw2Var2.f25257a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((nk1) objArr2[(i6 << 3) + i8]).mo7995Y(nl1.f25929c);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 == 8) {
                                    if (i6 != length2) {
                                        i6++;
                                    }
                                }
                            } else if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (bl1Var.m3620f() == null || bl1Var.f15396c.m10858T0() == nl1.f25929c) {
                    bl1Var.m3617c();
                }
                mw2Var.m8410b();
                mw2Var2.m8410b();
                xk1Var.f34331e = false;
                return ju4Var;
            case 6:
                return Boolean.valueOf(sl1.m10852X0(((xl1) obj).f34385v));
            default:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                um0 um0Var = workDatabase.f14686a;
                if (um0Var == null) {
                    z62.m13366Y("coroutineScope");
                    throw null;
                }
                zp0.m13682n(um0Var, null);
                workDatabase.m3064g();
                C1122rv c1122rv = workDatabase.f14689d;
                if (c1122rv != null) {
                    ((we4) c1122rv.f29654e).close();
                    return ju4Var;
                }
                z62.m13366Y("connectionManager");
                throw null;
        }
    }
}
