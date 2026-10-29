package p000;

import ads_mobile_sdk.C0313rh;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.widget.Magnifier;
import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class js1 implements p74, InterfaceC1198tx, qa0, e43, y33, v33, le4, ai3, InterfaceC0657fn, qd4, InterfaceC1355y4 {

    /* JADX INFO: renamed from: b */
    public static volatile js1 f22552b;

    /* JADX INFO: renamed from: c */
    public static final q50 f22553c = new q50(22);

    /* JADX INFO: renamed from: d */
    public static final xk5 f22554d = new xk5(28);

    /* JADX INFO: renamed from: a */
    public Object f22555a;

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    public js1(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        float[] fArr3;
        int i2;
        boolean z;
        float fHypot;
        float[] fArr4 = fArr;
        int i3 = 1;
        int length = fArr4.length - 1;
        C0915mn[][] c0915mnArr = new C0915mn[length][];
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i6 < length) {
            int i7 = iArr[i6];
            if (i7 == 0) {
                i5 = 3;
            } else if (i7 == i3) {
                i4 = i3;
                i5 = i4;
            } else {
                if (i7 != 2) {
                    if (i7 == 3) {
                        if (i4 != i3) {
                            i4 = i3;
                        }
                        i5 = i4;
                    } else if (i7 == 4) {
                        i5 = 4;
                    } else if (i7 == 5) {
                        i5 = 5;
                    }
                }
                i4 = 2;
                i5 = i4;
            }
            float[] fArr5 = fArr2[i6];
            int i8 = i6 + 1;
            float[] fArr6 = fArr2[i8];
            float f = fArr4[i6];
            float f2 = fArr4[i8];
            int length2 = (fArr5.length % 2) + (fArr5.length / 2);
            C0915mn[] c0915mnArr2 = new C0915mn[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                float f3 = fArr5[i10];
                int i11 = i10 + 1;
                float f4 = fArr5[i11];
                int i12 = length;
                float f5 = fArr6[i10];
                C0915mn[] c0915mnArr3 = c0915mnArr2;
                float f6 = fArr6[i11];
                C0915mn c0915mn = new C0915mn();
                c0915mn.f25040a = f;
                c0915mn.f25041b = f2;
                c0915mn.f25042c = f3;
                c0915mn.f25043d = f4;
                c0915mn.f25044e = f5;
                c0915mn.f25045f = f6;
                float f7 = f5 - f3;
                float f8 = f6 - f4;
                boolean z2 = i5 == 1 || (i5 == 4 ? f8 > 0.0f : !(i5 != 5 || f8 >= 0.0f));
                float f9 = z2 ? -1.0f : 1.0f;
                c0915mn.f25052m = f9;
                float f10 = 1.0f / (f2 - f);
                c0915mn.f25050k = f10;
                int i13 = i6;
                float[] fArr7 = new float[C0313rh.f10756T0];
                c0915mn.f25049j = fArr7;
                boolean z3 = i5 == 3;
                if (z3 || Math.abs(f7) < 0.001f || Math.abs(f8) < 0.001f) {
                    i = i5;
                    fArr3 = fArr5;
                    i2 = 1;
                    float fHypot2 = (float) Math.hypot(f8, f7);
                    c0915mn.f25046g = fHypot2;
                    c0915mn.f25051l = fHypot2 * f10;
                    c0915mn.f25056q = f7 * f10;
                    c0915mn.f25057r = f8 * f10;
                    c0915mn.f25053n = Float.NaN;
                    c0915mn.f25054o = Float.NaN;
                    z = true;
                } else {
                    c0915mn.f25053n = f7 * f9;
                    c0915mn.f25054o = f8 * (-f9);
                    c0915mn.f25056q = z2 ? f5 : f3;
                    c0915mn.f25057r = z2 ? f4 : f6;
                    float f11 = f4 - f6;
                    float[] fArr8 = z62.f35779a;
                    float f12 = f11;
                    float f13 = 0.0f;
                    float f14 = 0.0f;
                    int i14 = 1;
                    while (true) {
                        double d = (float) (((((double) i14) * 90.0d) / 90.0d) * 0.017453292519943295d);
                        float fSin = f7 * ((float) Math.sin(d));
                        float fCos = ((float) Math.cos(d)) * f11;
                        float f15 = f11;
                        float f16 = fSin - f14;
                        f14 = fSin;
                        double d2 = f16;
                        float f17 = fCos - f12;
                        i = i5;
                        fArr3 = fArr5;
                        fHypot = f13 + ((float) Math.hypot(d2, f17));
                        fArr8[i14] = fHypot;
                        if (i14 == 90) {
                            break;
                        }
                        i14++;
                        f13 = fHypot;
                        i5 = i;
                        f11 = f15;
                        f12 = fCos;
                        fArr5 = fArr3;
                    }
                    c0915mn.f25046g = fHypot;
                    int i15 = 1;
                    while (true) {
                        fArr8[i15] = fArr8[i15] / fHypot;
                        if (i15 == 90) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    for (int i16 = 0; i16 < 101; i16++) {
                        float f18 = i16 / 100.0f;
                        int iBinarySearch = Arrays.binarySearch(fArr8, 0, 91, f18);
                        if (iBinarySearch >= 0) {
                            fArr7[i16] = iBinarySearch / 90.0f;
                        } else {
                            if (iBinarySearch == -1) {
                                fArr7[i16] = 0.0f;
                            } else {
                                int i17 = -iBinarySearch;
                                int i18 = i17 - 2;
                                float f19 = i18;
                                float f20 = fArr8[i18];
                                fArr7[i16] = (((f18 - f20) / (fArr8[i17 - 1] - f20)) + f19) / 90.0f;
                            }
                        }
                    }
                    i2 = 1;
                    c0915mn.f25051l = c0915mn.f25046g * c0915mn.f25050k;
                    z = z3;
                }
                c0915mn.f25055p = z;
                VarHandle.storeStoreFence();
                c0915mnArr3[i9] = c0915mn;
                i9++;
                c0915mnArr2 = c0915mnArr3;
                i3 = i2;
                length = i12;
                i5 = i;
                i4 = i4;
                i6 = i13;
                fArr5 = fArr3;
            }
            c0915mnArr[i6] = c0915mnArr2;
            fArr4 = fArr;
            i6 = i8;
            i4 = i4;
        }
        this.f22555a = c0915mnArr;
    }

    /* JADX INFO: renamed from: p */
    public static me4 m7269p(ok3 ok3Var, b12 b12Var, gs2 gs2Var, hs2 hs2Var) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(b12Var.f14996a.getResources(), hs2Var.f20826a);
        kt0 kt0Var = kt0.f23413a;
        Map map = hs2Var.f20827b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = AbstractC0707h.f20231a;
        if (ok3Var != null && ok3Var.f26818g) {
            z = true;
        }
        return new me4(bitmapDrawable, b12Var, kt0Var, gs2Var, str, zBooleanValue, z);
    }

    @Override // p000.qd4
    /* JADX INFO: renamed from: a */
    public void mo7270a(gs2 gs2Var, Bitmap bitmap, Map map) {
        ((hf0) this.f22555a).m6384r(gs2Var, bitmap, map, se0.m10743x(bitmap));
    }

    @Override // p000.InterfaceC1355y4
    /* JADX INFO: renamed from: b */
    public void mo7271b(Object obj) {
        C1318x4 c1318x4 = (C1318x4) obj;
        eo1 eo1Var = (eo1) this.f22555a;
        ao1 ao1Var = (ao1) eo1Var.f18293F.pollLast();
        if (ao1Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = ao1Var.f14741a;
        int i = ao1Var.f14742b;
        pn1 pn1VarM12114A = eo1Var.f18306c.m12114A(str);
        if (pn1VarM12114A != null) {
            pn1VarM12114A.m9584l(i, c1318x4.f33968a, c1318x4.f33969b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // p000.p74
    /* JADX INFO: renamed from: c */
    public Object mo7272c(kk3 kk3Var) {
        ac4 ac4Var = ((C0880lp) this.f22555a).f24244g;
        C0843kp c0843kp = new C0843kp((byte) 0);
        c0843kp.f23306b = ac4Var;
        VarHandle.storeStoreFence();
        return lb5.m7901I(c0843kp, kk3Var);
    }

    @Override // p000.InterfaceC1198tx
    /* JADX INFO: renamed from: d */
    public void mo3671d(lk0 lk0Var) {
        boolean z = lk0Var.f24097e == 0;
        AbstractC1235ux abstractC1235ux = (AbstractC1235ux) this.f22555a;
        if (z) {
            abstractC1235ux.getRemoteService(null, abstractC1235ux.getScopes());
        } else if (abstractC1235ux.zzl() != null) {
            abstractC1235ux.zzl().onConnectionFailed(lk0Var);
        }
    }

    @Override // p000.v33
    /* JADX INFO: renamed from: e */
    public void mo140e() {
        ((CountDownLatch) this.f22555a).countDown();
    }

    @Override // p000.qa0
    /* JADX INFO: renamed from: f */
    public void mo7273f(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            ((Method) this.f22555a).invoke(th, th2);
        } catch (Throwable unused) {
            la0.f23887a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    @Override // p000.y33
    /* JADX INFO: renamed from: g */
    public void mo141g(Exception exc) {
        ((CountDownLatch) this.f22555a).countDown();
    }

    @Override // p000.ai3
    public Object get() {
        Context context = (Context) ((w42) this.f22555a).f33090b;
        r50 r50Var = new r50((byte) 22);
        f70 f70Var = new f70((byte) 21);
        jp0 jp0Var = new jp0((byte) 14, false);
        jp0Var.f22481b = context;
        jp0Var.f22482c = r50Var;
        jp0Var.f22483d = f70Var;
        VarHandle.storeStoreFence();
        return jp0Var;
    }

    @Override // p000.qd4
    /* JADX INFO: renamed from: h */
    public hs2 mo7274h(gs2 gs2Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014e A[PHI: r16
  0x014e: PHI (r16v3 hs2) = (r16v1 hs2), (r16v1 hs2), (r16v5 hs2) binds: [B:100:0x014c, B:96:0x0145, B:55:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0140 A[PHI: r16 r18
  0x0140: PHI (r16v1 hs2) = (r16v0 hs2), (r16v0 hs2), (r16v2 hs2) binds: [B:91:0x013d, B:86:0x0131, B:79:0x011e] A[DONT_GENERATE, DONT_INLINE]
  0x0140: PHI (r18v2 double) = (r18v1 double), (r18v1 double), (r18v3 double) binds: [B:91:0x013d, B:86:0x0131, B:79:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: i */
    public hs2 m7275i(b12 b12Var, gs2 gs2Var, g74 g74Var, qv3 qv3Var) {
        hs2 hs2VarMo7274h;
        double d;
        hs2 hs2Var;
        boolean zEquals;
        hs2 hs2Var2;
        if (b12Var.f15009n.f127a) {
            pk3 pk3Var = (pk3) ((lk3) this.f22555a).f24105c.getValue();
            if (pk3Var == null) {
                hs2VarMo7274h = null;
            } else {
                hs2VarMo7274h = pk3Var.f27690a.mo7274h(gs2Var);
                if (hs2VarMo7274h == null) {
                    hf0 hf0Var = pk3Var.f27691b;
                    synchronized (hf0Var) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) hf0Var.f20529c).get(gs2Var);
                            if (arrayList == null) {
                                hs2VarMo7274h = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        hs2Var2 = null;
                                        break;
                                    }
                                    wk3 wk3Var = (wk3) arrayList.get(i);
                                    Bitmap bitmap = (Bitmap) wk3Var.f33448b.get();
                                    hs2Var2 = bitmap != null ? new hs2(bitmap, wk3Var.f33449c) : null;
                                    if (hs2Var2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                int i2 = hf0Var.f20528b;
                                hf0Var.f20528b = i2 + 1;
                                if (i2 >= 10) {
                                    hf0Var.m6374f();
                                }
                                hs2VarMo7274h = hs2Var2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if (hs2VarMo7274h != null) {
                Bitmap bitmap2 = hs2VarMo7274h.f20826a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (config != Bitmap.Config.HARDWARE || b12Var.f15006k) {
                    Object obj = hs2VarMo7274h.f20827b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    if (z62.m13387o(g74Var, g74.f19639c)) {
                        hs2Var = null;
                        if (zBooleanValue) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        String str = (String) gs2Var.f20092b.get("coil#transformation_size");
                        if (str != null) {
                            zEquals = str.equals(g74Var.toString());
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            qs5 qs5Var = g74Var.f19640a;
                            int i3 = qs5Var instanceof oz0 ? ((oz0) qs5Var).f27241l : Integer.MAX_VALUE;
                            qs5 qs5Var2 = g74Var.f19641b;
                            int i4 = qs5Var2 instanceof oz0 ? ((oz0) qs5Var2).f27241l : Integer.MAX_VALUE;
                            double dM13784o = zt5.m13784o(width, height, i3, i4, qv3Var);
                            boolean zM5437a = AbstractC0632f.m5437a(b12Var);
                            if (zM5437a) {
                                double d2 = dM13784o > 1.0d ? 1.0d : dM13784o;
                                hs2Var = null;
                                d = 1.0d;
                                if (Math.abs(((double) i3) - (((double) width) * d2)) > 1.0d && Math.abs(((double) i4) - (d2 * ((double) height))) > 1.0d) {
                                    if ((dM13784o == d && !zM5437a) || (dM13784o > d && zBooleanValue)) {
                                        zEquals = false;
                                    }
                                }
                            } else {
                                d = 1.0d;
                                hs2Var = null;
                                if ((i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && Math.abs(i3 - width) > 1) || (i4 != Integer.MIN_VALUE && i4 != Integer.MAX_VALUE && Math.abs(i4 - height) > 1)) {
                                    if (dM13784o == d) {
                                        zEquals = false;
                                    } else {
                                        zEquals = false;
                                    }
                                }
                            }
                            zEquals = true;
                        }
                    }
                    if (zEquals) {
                        return hs2VarMo7274h;
                    }
                    return hs2Var;
                }
                zEquals = false;
                hs2Var = null;
                if (zEquals) {
                    return hs2VarMo7274h;
                }
                return hs2Var;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC0657fn
    /* JADX INFO: renamed from: k */
    public Object mo5747k(tx3 tx3Var, Float f, Float f2, yp1 yp1Var, y84 y84Var) {
        Object objM13677i = zp0.m13677i(tx3Var, f.floatValue(), k43.m7379a(0.0f, f2.floatValue(), 28), (gv0) this.f22555a, yp1Var, y84Var);
        return objM13677i == ap0.f14763a ? objM13677i : (C1295wj) objM13677i;
    }

    /* JADX INFO: renamed from: l */
    public long m7277l() {
        Magnifier magnifier = (Magnifier) this.f22555a;
        return (((long) magnifier.getWidth()) << 32) | (((long) magnifier.getHeight()) & 4294967295L);
    }

    /* JADX INFO: renamed from: m */
    public long m7278m() {
        cy0 cy0Var = (cy0) this.f22555a;
        long j = ((jq3) cy0Var.f16603t.f33259b).f22517c;
        if (j != 16) {
            return j;
        }
        tp3 tp3Var = (tp3) sj3.m10825u(cy0Var, xp3.f34517b);
        if (tp3Var != null) {
            long j2 = tp3Var.f31307a;
            if (j2 != 16) {
                return j2;
            }
        }
        return ((pb0) sj3.m10825u(cy0Var, zl0.f36166a)).f27503a;
    }

    @Override // p000.le4
    /* JADX INFO: renamed from: n */
    public nr6 mo3146n(Object obj) {
        c44 c44Var = (c44) obj;
        nh3 nh3Var = (nh3) this.f22555a;
        if (c44Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return y62.m12936B(null);
        }
        np0 np0Var = (np0) nh3Var.f25811c;
        ip0 ip0Var = np0.f25991r;
        np0Var.m8813g();
        np0Var.f26005m.m4954r(null, (yq0) np0Var.f25997e.f22481b);
        np0Var.f26009q.m7990c(null);
        return y62.m12936B(null);
    }

    /* JADX INFO: renamed from: o */
    public gs2 m7279o(b12 b12Var, Object obj, b63 b63Var, za1 za1Var) {
        String strMo5737a;
        Map linkedHashMap;
        b12Var.getClass();
        List list = b12Var.f15001f;
        List list2 = ((lk3) this.f22555a).f24108f.f21359c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strMo5737a = null;
                break;
            }
            l73 l73Var = (l73) list2.get(i);
            od2 od2Var = (od2) l73Var.f23833a;
            if (((Class) l73Var.f23834b).isAssignableFrom(obj.getClass()) && (strMo5737a = od2Var.mo5737a(obj, b63Var)) != null) {
                break;
            }
            i++;
        }
        if (strMo5737a == null) {
            return null;
        }
        Map map = b12Var.f15019x.f31698a;
        boolean zIsEmpty = map.isEmpty();
        w71 w71Var = w71.f33134a;
        if (zIsEmpty) {
            linkedHashMap = w71Var;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                xy4.m12778e();
                return null;
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new gs2(strMo5737a, w71Var);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        List list3 = list;
        if (!list3.isEmpty()) {
            if (list3.size() > 0) {
                list.get(0).getClass();
                xy4.m12778e();
                return null;
            }
            linkedHashMap2.put("coil#transformation_size", b63Var.f15112d.toString());
        }
        return new gs2(strMo5737a, linkedHashMap2);
    }

    @Override // p000.e43
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f22555a).countDown();
    }

    /* JADX INFO: renamed from: q */
    public void m7280q() {
        ((rn1) this.f22555a).f29433x.m5227P();
    }

    /* JADX INFO: renamed from: r */
    public void m7281r(C1372yl c1372yl, Thread thread, Throwable th) {
        nr6 nr6VarM8822f;
        np0 np0Var = (np0) this.f22555a;
        synchronized (np0Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            yq0 yq0Var = (yq0) np0Var.f25997e.f22481b;
            lp0 lp0Var = new lp0();
            lp0Var.f24261e = np0Var;
            lp0Var.f24257a = jCurrentTimeMillis;
            lp0Var.f24258b = th;
            lp0Var.f24259c = thread;
            lp0Var.f24260d = c1372yl;
            VarHandle.storeStoreFence();
            synchronized (yq0Var.f35459c) {
                nr6 nr6Var = (nr6) yq0Var.f35460d;
                ExecutorService executorService = (ExecutorService) yq0Var.f35458b;
                C1040pn c1040pn = new C1040pn((byte) 10);
                c1040pn.f27754b = lp0Var;
                VarHandle.storeStoreFence();
                nr6VarM8822f = nr6Var.m8822f(executorService, c1040pn);
                yq0Var.f35460d = nr6VarM8822f;
            }
            try {
                cw4.m4216a(nr6VarM8822f);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m7282s(int i, Object obj, gw3 gw3Var) {
        AbstractC1277w1 abstractC1277w1 = (AbstractC1277w1) obj;
        C1145sh c1145sh = (C1145sh) this.f22555a;
        c1145sh.m10759E(i, 2);
        c1145sh.m10761G(abstractC1277w1.mo11979a(gw3Var));
        gw3Var.mo6187i(abstractC1277w1, this);
    }

    public js1(byte b) {
        switch (b) {
            case 23:
                this.f22555a = null;
                break;
            default:
                this.f22555a = new AtomicInteger(0);
                break;
        }
    }

    public js1(oy4 oy4Var, my4 my4Var) {
        this(oy4Var, my4Var, br0.f15519b);
    }

    public js1(oy4 oy4Var, my4 my4Var, dr0 dr0Var) {
        C1283w7 c1283w7 = new C1283w7((byte) 23);
        c1283w7.f33127c = oy4Var;
        c1283w7.f33128d = my4Var;
        c1283w7.f33129e = dr0Var;
        c1283w7.f33126b = new q50((byte) 19);
        VarHandle.storeStoreFence();
        this.f22555a = c1283w7;
    }

    public js1(Magnifier magnifier) {
        this.f22555a = magnifier;
    }

    @Override // p000.qd4
    /* JADX INFO: renamed from: j */
    public void mo7276j(int i) {
    }
}
