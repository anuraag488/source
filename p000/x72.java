package p000;

import ads_mobile_sdk.g83;
import ads_mobile_sdk.i52;
import ads_mobile_sdk.ia1;
import ads_mobile_sdk.n52;
import ads_mobile_sdk.p31;
import ads_mobile_sdk.p52;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.q52;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.z21;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x72 implements q72, ra5 {

    /* JADX INFO: renamed from: a */
    public int f34036a;

    /* JADX INFO: renamed from: b */
    public Object f34037b;

    /* JADX INFO: renamed from: c */
    public Object f34038c;

    /* JADX INFO: renamed from: d */
    public Object f34039d;

    /* JADX INFO: renamed from: e */
    public Object f34040e;

    /* JADX INFO: renamed from: f */
    public Object f34041f;

    public x72(byte b) {
        switch (b) {
            case 3:
                this.f34036a = -1;
                this.f34038c = new LinkedHashMap();
                break;
            default:
                this.f34037b = new gx1[32];
                this.f34038c = new float[32];
                this.f34039d = new byte[32];
                mw2 mw2Var = uv3.f32207a;
                this.f34040e = new mw2();
                this.f34041f = new mw2();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m12518a(wm0 wm0Var) {
        q52 q52Var;
        x72 x72Var;
        String str;
        long j;
        long j2;
        PackageInfo packageInfo;
        if (wm0Var instanceof q52) {
            q52Var = (q52) wm0Var;
            int i = q52Var.f8863g;
            if ((i & Integer.MIN_VALUE) != 0) {
                q52Var.f8863g = i - Integer.MIN_VALUE;
            } else {
                q52Var = new q52(this, (ym0) wm0Var);
            }
        } else {
            q52Var = new q52(this, (ym0) wm0Var);
        }
        Object obj = q52Var.f8861e;
        ap0 ap0Var = ap0.f14763a;
        int i2 = q52Var.f8863g;
        wm0 wm0Var2 = null;
        if (i2 == 0) {
            k43.m7376J(obj);
            String strMo101m = ((AbstractC1384yx) this.f34040e).mo101m();
            if (strMo101m == null) {
                return null;
            }
            Context context = ((p31) this.f34041f).f8451a;
            PackageManager packageManager = context.getPackageManager();
            long longVersionCode = (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(128L))) == null) ? 0L : packageInfo.getLongVersionCode();
            i52 i52Var = (i52) this.f34039d;
            q52Var.f8857a = this;
            q52Var.f8858b = strMo101m;
            q52Var.f8859c = longVersionCode;
            q52Var.f8860d = longVersionCode;
            q52Var.f8863g = 1;
            Object objM1266v = i52Var.m1266v(q52Var);
            if (objM1266v != ap0Var) {
                x72Var = this;
                str = strMo101m;
                obj = objM1266v;
                j = longVersionCode;
                j2 = j;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                k43.m7376J(obj);
                return obj;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = q52Var.f8860d;
        long j3 = q52Var.f8859c;
        str = q52Var.f8858b;
        x72 x72Var2 = q52Var.f8857a;
        k43.m7376J(obj);
        x72Var = x72Var2;
        j = j3;
        if (j2 != ((Number) obj).longValue()) {
            sy3.m2303a((zo0) x72Var.f34037b, (t82) null, new C0455ai((byte) 5, j, wm0Var2, x72Var), 3);
            return null;
        }
        i52 i52Var2 = (i52) x72Var.f34039d;
        q52Var.f8857a = null;
        q52Var.f8858b = null;
        q52Var.f8863g = 2;
        Object objM1264b = i52Var2.m1264b(str, q52Var);
        return objM1264b == ap0Var ? ap0Var : objM1264b;
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: b */
    public boolean mo3135b() {
        return true;
    }

    @Override // p000.q72
    public void close() {
        try {
            ((oz1) ((qz1) this.f34039d)).m9338E();
        } catch (DeadObjectException e) {
            m12523i(e);
        } catch (RemoteException | RuntimeException e2) {
            Log.e("IsolateUsableState", "Exception was thrown during close()", e2);
            m12523i(e2);
        }
        m12520f(new r72("isolate closed"));
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: d */
    public void mo3136d(Executor executor, C1163sz c1163sz) {
        try {
            ((oz1) ((qz1) this.f34039d)).m9341H(new w72(executor, c1163sz));
        } catch (DeadObjectException e) {
            m12523i(e);
        } catch (RemoteException | RuntimeException e2) {
            m12523i(e2);
            if (!(e2 instanceof RuntimeException)) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: e */
    public zl2 mo3137e(String str) {
        m82 m82Var = ((i82) this.f34037b).f21169c;
        m82Var.getClass();
        if (!m82Var.f24732i.contains("JS_FEATURE_EVALUATE_WITHOUT_TRANSACTION_LIMIT")) {
            C1163sz c1163sz = new C1163sz((byte) 7);
            c1163sz.f30676b = this;
            c1163sz.f30677c = str;
            VarHandle.storeStoreFence();
            return AbstractC0647fd.m5686z(c1163sz);
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        C1163sz c1163sz2 = new C1163sz((byte) 6);
        c1163sz2.f30676b = this;
        c1163sz2.f30677c = bytes;
        VarHandle.storeStoreFence();
        return AbstractC0647fd.m5686z(c1163sz2);
    }

    /* JADX INFO: renamed from: f */
    public void m12520f(r72 r72Var) {
        Set set;
        synchronized (this.f34038c) {
            set = (Set) this.f34040e;
            this.f34040e = Collections.EMPTY_SET;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m60) it.next()).m8199b(r72Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m12521g(m60 m60Var, int i, String str) {
        if (i == 0) {
            m60Var.m8199b(new ua1(str));
            return;
        }
        if (i == 1) {
            vi4 vi4Var = new vi4(3, str);
            ((i82) this.f34037b).m6695g(vi4Var);
            m60Var.m8199b(vi4Var.m11900a());
        } else {
            if (i == 2) {
                m60Var.m8199b(new gt0(str));
                return;
            }
            m60Var.m8199b(new g82("Unknown error: code " + i + ": " + str));
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m12522h() {
        return this.f34036a < ((List) this.f34039d).size() || !((ArrayList) this.f34041f).isEmpty();
    }

    /* JADX INFO: renamed from: i */
    public vi4 m12523i(Exception exc) {
        i82 i82Var = (i82) this.f34037b;
        i82Var.f21169c.m8224j(exc);
        vi4 vi4VarM6696j = i82Var.m6696j();
        Objects.requireNonNull(vi4VarM6696j);
        return vi4VarM6696j;
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: j */
    public void mo3142j(Executor executor, i85 i85Var) {
        if (((HashMap) this.f34041f).putIfAbsent(i85Var, executor) == null) {
            return;
        }
        C1077qn.m9989o("Termination callback already registered");
    }

    /* JADX INFO: renamed from: k */
    public void m12524k(gx1 gx1Var) {
        int iM9210e0 = AbstractC0990oo.m9210e0(gx1Var, (gx1[]) this.f34037b);
        if (iM9210e0 >= 0) {
            gx1[] gx1VarArr = (gx1[]) this.f34037b;
            int i = iM9210e0 + 1;
            AbstractC0990oo.m9198S(iM9210e0, i, this.f34036a, gx1VarArr, gx1VarArr);
            gx1[] gx1VarArr2 = (gx1[]) this.f34037b;
            int i2 = this.f34036a;
            gx1VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.f34038c;
            System.arraycopy(fArr, i, fArr, iM9210e0, i2 - i);
            byte[] bArr = (byte[]) this.f34039d;
            System.arraycopy(bArr, i, bArr, iM9210e0, this.f34036a - i);
            this.f34036a--;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m12525l(m60 m60Var) {
        synchronized (this.f34038c) {
            ((Set) this.f34040e).remove(m60Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p000.ra5
    /* JADX INFO: renamed from: s */
    public Object mo279s(wm0 wm0Var) {
        p52 p52Var;
        String lowerCase;
        Integer num;
        ArrayList arrayList;
        List listMo8886c;
        Boolean bool;
        Boolean boolValueOf;
        Integer num2;
        Boolean boolValueOf2;
        y34 y34VarMo8891h;
        Integer num3;
        Boolean bool2;
        String str;
        x72 x72Var = this;
        if (wm0Var instanceof p52) {
            p52Var = (p52) wm0Var;
            int i = p52Var.f8476o;
            if ((i & Integer.MIN_VALUE) != 0) {
                p52Var.f8476o = i - Integer.MIN_VALUE;
            } else {
                p52Var = new p52(x72Var, (ym0) wm0Var);
            }
        } else {
            p52Var = new p52(x72Var, (ym0) wm0Var);
        }
        Object objM12518a = p52Var.f8474m;
        ap0 ap0Var = ap0.f14763a;
        int i2 = p52Var.f8476o;
        if (i2 == 0) {
            k43.m7376J(objM12518a);
            qx2 qx2Var = (qx2) x72Var.f34038c;
            lowerCase = qx2Var.mo8885b() != kx2.f23574a ? qx2Var.mo8885b().name().toLowerCase(Locale.ROOT) : null;
            num = new Integer(3);
            List listMo8893j = qx2Var.mo8893j();
            arrayList = new ArrayList();
            Iterator it = listMo8893j.iterator();
            while (it.hasNext()) {
                int i3 = sd5.f30186a[((jx2) it.next()).ordinal()];
                if (i3 != 1) {
                    str = i3 != 2 ? null : "6";
                } else {
                    str = "3";
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            listMo8886c = qx2Var.mo8886c();
            bool = Boolean.TRUE;
            boolValueOf = Boolean.valueOf(qx2Var.mo8888e());
            lx2 lx2VarMo8889f = qx2Var.mo8889f();
            num2 = lx2VarMo8889f != null ? new Integer(lx2VarMo8889f.f24436a) : null;
            boolValueOf2 = qx2Var.mo8889f() != null ? Boolean.valueOf(qx2Var.mo8890g()) : null;
            y34VarMo8891h = qx2Var.mo8891h();
            Boolean boolValueOf3 = Boolean.valueOf(qx2Var.mo8887d());
            num3 = new Integer(qx2Var.mo8895l().f29017a);
            p52Var.f8462a = x72Var;
            p52Var.f8463b = num;
            p52Var.f8464c = arrayList;
            p52Var.f8465d = num2;
            p52Var.f8466e = boolValueOf;
            p52Var.f8467f = lowerCase;
            p52Var.f8468g = bool;
            p52Var.f8469h = listMo8886c;
            p52Var.f8470i = boolValueOf2;
            p52Var.f8471j = num3;
            p52Var.f8472k = boolValueOf3;
            p52Var.f8473l = y34VarMo8891h;
            p52Var.f8476o = 1;
            objM12518a = x72Var.m12518a(p52Var);
            if (objM12518a == ap0Var) {
                return ap0Var;
            }
            bool2 = boolValueOf3;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y34 y34Var = p52Var.f8473l;
            bool2 = p52Var.f8472k;
            Integer num4 = p52Var.f8471j;
            boolValueOf2 = p52Var.f8470i;
            listMo8886c = p52Var.f8469h;
            bool = p52Var.f8468g;
            lowerCase = p52Var.f8467f;
            boolValueOf = p52Var.f8466e;
            num2 = p52Var.f8465d;
            arrayList = p52Var.f8464c;
            num = p52Var.f8463b;
            x72 x72Var2 = p52Var.f8462a;
            k43.m7376J(objM12518a);
            num3 = num4;
            y34VarMo8891h = y34Var;
            x72Var = x72Var2;
        }
        Boolean bool3 = (Boolean) objM12518a;
        Integer num5 = new Integer(x72Var.f34036a);
        if (num5.intValue() <= 1) {
            num5 = null;
        }
        n52 n52Var = new n52();
        n52Var.f7553a = num;
        n52Var.f7554b = arrayList;
        n52Var.f7555c = listMo8886c;
        n52Var.f7556d = bool;
        n52Var.f7557e = lowerCase;
        n52Var.f7558f = boolValueOf;
        n52Var.f7559g = num2;
        n52Var.f7560h = boolValueOf2;
        n52Var.f7561i = y34VarMo8891h;
        n52Var.f7562j = bool2;
        n52Var.f7563k = num3;
        n52Var.f7564l = bool3;
        n52Var.f7565m = num5;
        VarHandle.storeStoreFence();
        return new q11(n52Var);
    }

    @Override // p000.ra5
    /* JADX INFO: renamed from: d */
    public z21 mo278d() {
        return z21.f13987J;
    }

    /* JADX INFO: renamed from: a */
    public ia1 m12517a() {
        int i = this.f34036a;
        if (i >= 0) {
            String str = (String) this.f34037b;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f34038c;
            g83 g83Var = (g83) this.f34039d;
            cf0 cf0Var = (cf0) this.f34040e;
            String str2 = (String) this.f34041f;
            ia1 ia1Var = new ia1();
            ia1Var.f4911a = i;
            ia1Var.f4912b = str;
            ia1Var.f4913c = linkedHashMap;
            ia1Var.f4914d = g83Var;
            ia1Var.f4915e = cf0Var;
            ia1Var.f4916f = str2;
            VarHandle.storeStoreFence();
            return ia1Var;
        }
        xy4.m12780h(c75.m3877i(i, "Invalid status code: "));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m12519a(Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new l73((String) entry.getKey(), hb0.m6305Q0((List) entry.getValue(), ", ", null, null, 0, null, 62)));
            }
            linkedHashMap = new LinkedHashMap(eq2.m5277P(arrayList));
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.f34038c = linkedHashMap;
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: a */
    public void mo9753a(vi4 vi4Var) {
        m12520f(vi4Var.m11900a());
        HashMap map = (HashMap) this.f34041f;
        s72 s72Var = new s72();
        s72Var.f29941a = vi4Var;
        VarHandle.storeStoreFence();
        map.forEach(s72Var);
    }
}
