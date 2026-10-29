package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.C0132ga;
import ads_mobile_sdk.f71;
import ads_mobile_sdk.fa1;
import ads_mobile_sdk.g83;
import ads_mobile_sdk.ga1;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.ia1;
import ads_mobile_sdk.k11;
import ads_mobile_sdk.q11;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a00 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f1A;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f2t;

    /* JADX INFO: renamed from: u */
    public Object f3u;

    /* JADX INFO: renamed from: v */
    public byte f4v;

    /* JADX INFO: renamed from: w */
    public Object f5w;

    /* JADX INFO: renamed from: x */
    public Object f6x;

    /* JADX INFO: renamed from: y */
    public Object f7y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f8z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(wm0 wm0Var, sp1 sp1Var, InterfaceC0755ia interfaceC0755ia, yp1 yp1Var, xz4 xz4Var, yp1 yp1Var2, lv1 lv1Var) {
        super(2, wm0Var);
        this.f2t = (byte) 2;
        this.f5w = sp1Var;
        this.f6x = interfaceC0755ia;
        this.f3u = yp1Var;
        this.f7y = xz4Var;
        this.f8z = yp1Var2;
        this.f1A = lv1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f2t;
        Object obj2 = this.f1A;
        Object obj3 = this.f8z;
        switch (b) {
            case 0:
                a00 a00Var = new a00((og3) this.f7y, (d00) obj3, (xn2) obj2, wm0Var, (byte) 0);
                a00Var.f3u = obj;
                return a00Var;
            case 1:
                return new a00((v14) this.f7y, (C1260vl) obj3, this.f1A, wm0Var, (byte) 1);
            case 2:
                return new a00(wm0Var, (sp1) this.f5w, (InterfaceC0755ia) this.f6x, (yp1) this.f3u, (xz4) this.f7y, (yp1) obj3, (lv1) obj2);
            case 3:
                yw2 yw2Var = yw2.f35566a;
                a00 a00Var2 = new a00((ex2) obj3, (yp1) obj2, wm0Var);
                a00Var2.f7y = obj;
                return a00Var2;
            case 4:
                a00 a00Var3 = new a00((od1) this.f5w, (C1354y3) this.f6x, (u93) this.f7y, (gr1) obj3, (sw2) obj2, wm0Var);
                a00Var3.f3u = obj;
                return a00Var3;
            case 5:
                a00 a00Var4 = new a00((f71) obj3, (mq1) obj2, wm0Var);
                a00Var4.f3u = obj;
                return a00Var4;
            default:
                return new a00((wa2) this.f7y, (C0132ga) obj3, (i82) obj2, wm0Var, (byte) 6);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((a00) create((wm0) obj2, (C0927mz) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((a00) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((a00) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((a00) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((a00) create((wm0) obj2, (ag0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((a00) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((a00) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025f A[Catch: all -> 0x02a2, TRY_ENTER, TryCatch #2 {all -> 0x02a2, blocks: (B:64:0x016d, B:95:0x022f, B:102:0x025f, B:104:0x0263), top: B:336:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0263 A[Catch: all -> 0x02a2, TRY_LEAVE, TryCatch #2 {all -> 0x02a2, blocks: (B:64:0x016d, B:95:0x022f, B:102:0x025f, B:104:0x0263), top: B:336:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:166:0x0378 A[Catch: all -> 0x0327, PHI: r2 r3 r4 r5
  0x0378: PHI (r2v48 mq1) = (r2v47 mq1), (r2v47 mq1), (r2v55 mq1) binds: [B:162:0x0364, B:164:0x0375, B:152:0x0323] A[DONT_GENERATE, DONT_INLINE]
  0x0378: PHI (r3v32 ads_mobile_sdk.f71) = (r3v31 ads_mobile_sdk.f71), (r3v31 ads_mobile_sdk.f71), (r3v36 ads_mobile_sdk.f71) binds: [B:162:0x0364, B:164:0x0375, B:152:0x0323] A[DONT_GENERATE, DONT_INLINE]
  0x0378: PHI (r4v21 gx2) = (r4v20 gx2), (r4v20 gx2), (r4v25 gx2) binds: [B:162:0x0364, B:164:0x0375, B:152:0x0323] A[DONT_GENERATE, DONT_INLINE]
  0x0378: PHI (r5v32 zo0) = (r5v31 zo0), (r5v31 zo0), (r5v36 zo0) binds: [B:162:0x0364, B:164:0x0375, B:152:0x0323] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {all -> 0x0327, blocks: (B:152:0x0323, B:166:0x0378, B:161:0x0362, B:163:0x0366), top: B:348:0x02fe }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179 A[Catch: all -> 0x01ad, TRY_ENTER, TryCatch #9 {all -> 0x01ad, blocks: (B:84:0x01e9, B:86:0x01ed, B:89:0x01f6, B:90:0x020e, B:92:0x0214, B:93:0x022a, B:67:0x0179, B:69:0x019d, B:75:0x01b4, B:77:0x01c2, B:78:0x01c7, B:80:0x01d2, B:97:0x0233, B:100:0x024f), top: B:350:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x019d A[Catch: all -> 0x01ad, TryCatch #9 {all -> 0x01ad, blocks: (B:84:0x01e9, B:86:0x01ed, B:89:0x01f6, B:90:0x020e, B:92:0x0214, B:93:0x022a, B:67:0x0179, B:69:0x019d, B:75:0x01b4, B:77:0x01c2, B:78:0x01c7, B:80:0x01d2, B:97:0x0233, B:100:0x024f), top: B:350:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c2 A[Catch: all -> 0x01ad, TryCatch #9 {all -> 0x01ad, blocks: (B:84:0x01e9, B:86:0x01ed, B:89:0x01f6, B:90:0x020e, B:92:0x0214, B:93:0x022a, B:67:0x0179, B:69:0x019d, B:75:0x01b4, B:77:0x01c2, B:78:0x01c7, B:80:0x01d2, B:97:0x0233, B:100:0x024f), top: B:350:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c7 A[Catch: all -> 0x01ad, TryCatch #9 {all -> 0x01ad, blocks: (B:84:0x01e9, B:86:0x01ed, B:89:0x01f6, B:90:0x020e, B:92:0x0214, B:93:0x022a, B:67:0x0179, B:69:0x019d, B:75:0x01b4, B:77:0x01c2, B:78:0x01c7, B:80:0x01d2, B:97:0x0233, B:100:0x024f), top: B:350:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01d2 A[Catch: all -> 0x01ad, TryCatch #9 {all -> 0x01ad, blocks: (B:84:0x01e9, B:86:0x01ed, B:89:0x01f6, B:90:0x020e, B:92:0x0214, B:93:0x022a, B:67:0x0179, B:69:0x019d, B:75:0x01b4, B:77:0x01c2, B:78:0x01c7, B:80:0x01d2, B:97:0x0233, B:100:0x024f), top: B:350:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ed A[Catch: all -> 0x01ad, TryCatch #9 {all -> 0x01ad, blocks: (B:84:0x01e9, B:86:0x01ed, B:89:0x01f6, B:90:0x020e, B:92:0x0214, B:93:0x022a, B:67:0x0179, B:69:0x019d, B:75:0x01b4, B:77:0x01c2, B:78:0x01c7, B:80:0x01d2, B:97:0x0233, B:100:0x024f), top: B:350:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x0214 A[Catch: all -> 0x01ad, LOOP:1: B:90:0x020e->B:92:0x0214, LOOP_END, TryCatch #9 {all -> 0x01ad, blocks: (B:84:0x01e9, B:86:0x01ed, B:89:0x01f6, B:90:0x020e, B:92:0x0214, B:93:0x022a, B:67:0x0179, B:69:0x019d, B:75:0x01b4, B:77:0x01c2, B:78:0x01c7, B:80:0x01d2, B:97:0x0233, B:100:0x024f), top: B:350:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x022f A[Catch: all -> 0x02a2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02a2, blocks: (B:64:0x016d, B:95:0x022f, B:102:0x025f, B:104:0x0263), top: B:336:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0233 A[Catch: all -> 0x01ad, TRY_ENTER, TryCatch #9 {all -> 0x01ad, blocks: (B:84:0x01e9, B:86:0x01ed, B:89:0x01f6, B:90:0x020e, B:92:0x0214, B:93:0x022a, B:67:0x0179, B:69:0x019d, B:75:0x01b4, B:77:0x01c2, B:78:0x01c7, B:80:0x01d2, B:97:0x0233, B:100:0x024f), top: B:350:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x024e  */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x039a, code lost:
    
        if (((p000.e92) r2).mo5005t(r19) == r0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0408, code lost:
    
        if (p000.d24.m4318s(r1, r19) == r4) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x043f, code lost:
    
        if (p000.lb5.m7921b0(r8.mo5182k().minusKey(p000.o85.f26448h), new p000.C0671g0((java.lang.Object) r8, (java.lang.Object) r1, (p000.wm0) null, (byte) 16), r19) == r4) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x05fd, code lost:
    
        if (r1 == r0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x069f, code lost:
    
        if (r1 == r4) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x01af: MOVE (r11 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:432), block:B:73:0x01ae */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0046: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:71), block:B:12:0x0046 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01ae: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:431), block:B:73:0x01ae */
    /* JADX WARN: Type inference failed for: r2v17, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [gx2] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [gx2] */
    /* JADX WARN: Type inference failed for: r2v36, types: [gx2] */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        h50 h50Var;
        boolean z;
        Object objM12823D0;
        Object objM5007w;
        v14 v14Var;
        C1260vl c1260vl;
        v14 v14Var2;
        Object objInvoke;
        Object objMo5773c;
        Object obj2;
        bx2 bx2Var;
        yp1 yp1Var;
        bx2 bx2Var2;
        gx2 gx2Var;
        ex2 ex2Var;
        ex2 ex2Var2;
        bx2 bx2Var3;
        Object objInvoke2;
        ?? r2;
        zo0 zo0Var;
        gx2 gx2Var2;
        f71 f71Var;
        mq1 mq1Var;
        String str;
        i82 i82Var;
        ju4 ju4Var;
        String strMo3532s;
        String str2;
        String str3;
        Object objM5910b;
        wa2 wa2VarM1038a;
        mi5 mi5Var;
        Object objMo3997v;
        g83 g83Var;
        wa2 wa2Var;
        mi5 mi5Var2;
        wa2 wa2Var2;
        String str4;
        String str5;
        g83 g83Var2;
        hx0 hx0Var;
        String strMo3532s2;
        String strMo3532s3;
        byte b = this.f2t;
        byte b2 = 3;
        ju4 ju4Var2 = ju4.f22634a;
        Object obj3 = this.f8z;
        Object obj4 = this.f1A;
        switch (b) {
            case 0:
                og3 og3Var = (og3) this.f7y;
                C0927mz c0927mz = (C0927mz) this.f3u;
                ap0 ap0Var = ap0.f14763a;
                byte b3 = this.f4v;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    h50Var = new h50(b2);
                    String str6 = og3Var.f26681a;
                    String str7 = og3Var.f26682b.f25775a;
                    this.f3u = null;
                    this.f5w = c0927mz;
                    this.f6x = h50Var;
                    z = true;
                    this.f4v = (byte) 1;
                    objM12823D0 = y42.m12823D0(c0927mz, str6, str7, this);
                    if (objM12823D0 != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b3 == 1) {
                    h50 h50Var2 = (h50) this.f6x;
                    c0927mz = (C0927mz) this.f5w;
                    k43.m7376J(obj);
                    h50Var = h50Var2;
                    z = true;
                    objM12823D0 = obj;
                } else {
                    if (b3 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                    objM5007w = obj;
                    z = true;
                }
                boolean z2 = ((tl0) objM5007w).f31219a.f18622a == 0 ? z : false;
                Boolean boolValueOf = Boolean.valueOf(z2);
                d00 d00Var = (d00) obj3;
                if (z2) {
                    d00Var.f16657a.setValue(Boolean.FALSE);
                }
                xn2 xn2Var = (xn2) obj4;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, og3Var.f26681a + " consume purchase result " + z2, null);
                    }
                }
                return boolValueOf;
                ji3 ji3Var = (ji3) objM12823D0;
                if (ji3Var == null) {
                    return Boolean.FALSE;
                }
                JSONObject jSONObject = ji3Var.f22316c;
                String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                h50Var.getClass();
                if (strOptString == null) {
                    C1077qn.m9987m("Purchase token must be set");
                    return null;
                }
                C0973o7 c0973o7 = new C0973o7((byte) 10);
                c0973o7.f26402b = strOptString;
                this.f3u = null;
                this.f5w = null;
                this.f6x = null;
                this.f4v = (byte) 2;
                cf0 cf0Var = new cf0();
                C0964nz c0964nz = new C0964nz();
                c0964nz.f26206a = cf0Var;
                c0927mz.mo5432b(c0973o7, c0964nz);
                objM5007w = cf0Var.m5007w(this);
                break;
                break;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                byte b4 = this.f4v;
                try {
                    if (b4 == 0) {
                        k43.m7376J(obj);
                        v14 v14Var3 = (v14) this.f7y;
                        C1260vl c1260vl2 = (C1260vl) obj3;
                        this.f5w = v14Var3;
                        this.f6x = c1260vl2;
                        this.f3u = obj4;
                        this.f4v = (byte) 1;
                        if (v14Var3.m11203a(this) != ap0Var2) {
                            v14Var = v14Var3;
                            c1260vl = c1260vl2;
                        }
                        return ap0Var2;
                    }
                    if (b4 != 1) {
                        if (b4 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v14Var2 = (v14) this.f5w;
                        try {
                            k43.m7376J(obj);
                            v14Var = v14Var2;
                            objInvoke = obj;
                            v14Var.m11205c();
                            return objInvoke;
                        } catch (Throwable th) {
                            th = th;
                            v14Var2.m11205c();
                            throw th;
                        }
                    }
                    obj4 = this.f3u;
                    c1260vl = (C1260vl) this.f6x;
                    v14Var = (v14) this.f5w;
                    k43.m7376J(obj);
                    this.f5w = v14Var;
                    this.f6x = null;
                    this.f3u = null;
                    this.f4v = (byte) 2;
                    objInvoke = c1260vl.invoke(obj4, this);
                } catch (Throwable th2) {
                    th = th2;
                    v14Var2 = v14Var;
                    v14Var2.m11205c();
                    throw th;
                }
                break;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                byte b5 = this.f4v;
                if (b5 != 0) {
                    if (b5 == 1) {
                        k43.m7376J(obj);
                        objMo5773c = obj;
                    } else {
                        if (b5 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    return ju4Var2;
                }
                k43.m7376J(obj);
                sp1 sp1Var = (sp1) this.f5w;
                this.f4v = (byte) 1;
                objMo5773c = sp1Var.mo5773c(this);
                if (objMo5773c == ap0Var3) {
                    return ap0Var3;
                }
                boolean zBooleanValue = ((Boolean) objMo5773c).booleanValue();
                InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) this.f6x;
                if (interfaceC0755ia != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("success", String.valueOf(zBooleanValue));
                    interfaceC0755ia.mo6706b("reward_trial_selected", bundle);
                }
                if (zBooleanValue) {
                    this.f4v = (byte) 2;
                    if (AbstractC0647fd.m5667e((yp1) this.f3u, (xz4) this.f7y, (yp1) obj3, (lv1) obj4, "Trial version unlocked, enjoy! 🚀", ws1.f33689a, this) == ap0Var3) {
                        return ap0Var3;
                    }
                }
                return ju4Var2;
            case 3:
                ex2 ex2Var3 = (ex2) obj3;
                ap0 ap0Var4 = ap0.f14763a;
                ?? r3 = this.f4v;
                try {
                    try {
                        if (r3 == 0) {
                            k43.m7376J(obj);
                            zo0 zo0Var2 = (zo0) this.f7y;
                            yw2 yw2Var = yw2.f35566a;
                            t82 t82Var = (t82) zo0Var2.mo6367f().get(o85.f26448h);
                            bx2 bx2Var4 = new bx2();
                            bx2Var4.f15670a = t82Var;
                            VarHandle.storeStoreFence();
                            AtomicReference atomicReference = ex2Var3.f18557a;
                            do {
                                bx2Var = (bx2) atomicReference.get();
                                if (bx2Var != null) {
                                    yw2 yw2Var2 = yw2.f35566a;
                                    if (yw2Var2.compareTo(yw2Var2) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                            } while (!atomicReference.compareAndSet(bx2Var, bx2Var4));
                            if (bx2Var != null) {
                                bx2Var.f15670a.mo4993a(new zw2("Mutation interrupted"));
                            }
                            gx2 gx2Var3 = ex2Var3.f18558b;
                            yp1Var = (yp1) obj4;
                            this.f7y = bx2Var4;
                            this.f5w = gx2Var3;
                            this.f3u = yp1Var;
                            this.f6x = ex2Var3;
                            this.f4v = (byte) 1;
                            if (gx2Var3.m6191e(this) != ap0Var4) {
                                bx2Var2 = bx2Var4;
                                gx2Var = gx2Var3;
                            }
                            return ap0Var4;
                        }
                        if (r3 != 1) {
                            if (r3 != 2) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ex2Var2 = (ex2) this.f3u;
                            r3 = (gx2) this.f5w;
                            bx2Var3 = (bx2) this.f7y;
                            try {
                                k43.m7376J(obj);
                                objInvoke2 = obj;
                                r2 = r3;
                                ex2Var2.f18557a.compareAndSet(bx2Var3, null);
                                r2.m6193g(null);
                                return objInvoke2;
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = null;
                                try {
                                    ex2Var2.f18557a.compareAndSet(bx2Var3, null);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r3.m6193g(obj2);
                                    throw th;
                                }
                            }
                        }
                        ex2Var3 = (ex2) this.f6x;
                        yp1 yp1Var2 = (yp1) this.f3u;
                        gx2Var = (gx2) this.f5w;
                        bx2 bx2Var5 = (bx2) this.f7y;
                        k43.m7376J(obj);
                        bx2Var2 = bx2Var5;
                        yp1Var = yp1Var2;
                        this.f7y = bx2Var2;
                        this.f5w = gx2Var;
                        this.f3u = ex2Var;
                        this.f6x = null;
                        this.f4v = (byte) 2;
                        objInvoke2 = yp1Var.invoke(this);
                        if (objInvoke2 != ap0Var4) {
                            ex2Var2 = ex2Var;
                            r2 = gx2Var;
                            bx2Var3 = bx2Var2;
                            ex2Var2.f18557a.compareAndSet(bx2Var3, null);
                            r2.m6193g(null);
                            return objInvoke2;
                        }
                        return ap0Var4;
                    } catch (Throwable th5) {
                        th = th5;
                        ex2Var2 = ex2Var;
                        r3 = gx2Var;
                        bx2Var3 = bx2Var2;
                        obj2 = null;
                        ex2Var2.f18557a.compareAndSet(bx2Var3, null);
                        throw th;
                    }
                    ex2Var = ex2Var3;
                } catch (Throwable th6) {
                    th = th6;
                    obj2 = null;
                }
                break;
            case 4:
                C1354y3 c1354y3 = (C1354y3) this.f6x;
                od1 od1Var = (od1) this.f5w;
                ag0 ag0Var = (ag0) this.f3u;
                ap0 ap0Var5 = ap0.f14763a;
                byte b6 = this.f4v;
                if (b6 == 0) {
                    k43.m7376J(obj);
                    if (ag0Var == null) {
                        Boolean bool = (Boolean) od1Var.f26640e.getValue();
                        Boolean bool2 = Boolean.TRUE;
                        if (z62.m13387o(bool, bool2)) {
                            if (c1354y3.m12815a() != null || z62.m13387o(((u93) this.f7y).mo11770a(), bool2)) {
                                gr1 gr1Var = (gr1) obj3;
                                up4 up4Var = new up4((byte) 10);
                                up4Var.f32066c = c1354y3;
                                up4Var.f32065b = od1Var;
                                VarHandle.storeStoreFence();
                                pg0 pg0Var = new pg0(-86138774, true, up4Var);
                                this.f3u = ag0Var;
                                this.f4v = (byte) 2;
                            } else {
                                r50 r50Var = i41.f21117b;
                                long jM3238Q = as4.m3238Q(90, m41.SECONDS);
                                this.f3u = ag0Var;
                                this.f4v = (byte) 1;
                            }
                        }
                    }
                    break;
                } else {
                    if (b6 != 1 && b6 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                ((sw2) obj4).setValue(Boolean.valueOf(ag0Var != null));
                return ju4Var2;
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                byte b7 = this.f4v;
                try {
                    if (b7 == 0) {
                        k43.m7376J(obj);
                        zo0 zo0Var3 = (zo0) this.f3u;
                        f71 f71Var2 = (f71) obj3;
                        gx2 gx2Var4 = f71Var2.f3338e;
                        mq1 mq1Var2 = (mq1) obj4;
                        this.f3u = zo0Var3;
                        this.f5w = gx2Var4;
                        this.f6x = f71Var2;
                        this.f7y = mq1Var2;
                        this.f4v = (byte) 1;
                        if (gx2Var4.m6191e(this) != ap0Var6) {
                            zo0Var = zo0Var3;
                            gx2Var2 = gx2Var4;
                            f71Var = f71Var2;
                            mq1Var = mq1Var2;
                        }
                        return ap0Var6;
                    }
                    if (b7 != 1) {
                        if (b7 == 2) {
                            mq1Var = (mq1) this.f7y;
                            f71Var = (f71) this.f6x;
                            gx2Var2 = (gx2) this.f5w;
                            zo0Var = (zo0) this.f3u;
                            k43.m7376J(obj);
                            t82 t82VarM7910S = lb5.m7910S(zo0Var, null, cp0.f16328d, new C1160sw(f71Var, mq1Var, (wm0) null), 1);
                            f71Var.f3339f = t82VarM7910S;
                            gx2Var2.m6193g(null);
                            this.f3u = null;
                            this.f5w = null;
                            this.f6x = null;
                            this.f7y = null;
                            this.f4v = (byte) 3;
                        } else {
                            if (b7 != 3) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            k43.m7376J(obj);
                        }
                        break;
                    } else {
                        mq1Var = (mq1) this.f7y;
                        f71Var = (f71) this.f6x;
                        gx2Var2 = (gx2) this.f5w;
                        zo0Var = (zo0) this.f3u;
                        k43.m7376J(obj);
                    }
                    return ju4Var2;
                    t82 t82Var2 = f71Var.f3339f;
                    if (t82Var2 == null) {
                        t82 t82VarM7910S2 = lb5.m7910S(zo0Var, null, cp0.f16328d, new C1160sw(f71Var, mq1Var, (wm0) null), 1);
                        f71Var.f3339f = t82VarM7910S2;
                        gx2Var2.m6193g(null);
                        this.f3u = null;
                        this.f5w = null;
                        this.f6x = null;
                        this.f7y = null;
                        this.f4v = (byte) 3;
                        break;
                    } else {
                        this.f3u = zo0Var;
                        this.f5w = gx2Var2;
                        this.f6x = f71Var;
                        this.f7y = mq1Var;
                        this.f4v = (byte) 2;
                        if (y70.m13033m(t82Var2, this) != ap0Var6) {
                            t82 t82VarM7910S3 = lb5.m7910S(zo0Var, null, cp0.f16328d, new C1160sw(f71Var, mq1Var, (wm0) null), 1);
                            f71Var.f3339f = t82VarM7910S3;
                            gx2Var2.m6193g(null);
                            this.f3u = null;
                            this.f5w = null;
                            this.f6x = null;
                            this.f7y = null;
                            this.f4v = (byte) 3;
                            break;
                        }
                    }
                    return ap0Var6;
                } catch (Throwable th7) {
                    gx2Var2.m6193g(null);
                    throw th7;
                }
            default:
                i82 i82Var2 = (i82) obj4;
                C0132ga c0132ga = (C0132ga) obj3;
                wa2 wa2Var3 = (wa2) this.f7y;
                ap0 ap0Var7 = ap0.f14763a;
                byte b8 = this.f4v;
                String strM1034a = "";
                try {
                    if (b8 != 0) {
                        try {
                            try {
                                try {
                                    if (b8 == 1) {
                                        str3 = (String) this.f5w;
                                        k43.m7376J(obj);
                                        objM5910b = obj;
                                        ju4Var = ju4Var2;
                                        i82Var2 = i82Var2;
                                        try {
                                            mi5Var2 = (mi5) objM5910b;
                                            if (mi5Var2 instanceof q11) {
                                                wa2Var = new wa2();
                                                wa2Var.m12183w("requestId", str3);
                                                wa2Var.m12181u(new Integer(((ia1) ((q11) mi5Var2).f8791b).f4911a), "statusCode");
                                                str5 = ((ia1) ((q11) mi5Var2).f8791b).f4912b;
                                                if (str5 == null) {
                                                    if (((ia1) ((q11) mi5Var2).f8791b).f4911a == 200) {
                                                        str5 = "OK";
                                                    } else {
                                                        str5 = "";
                                                    }
                                                }
                                                wa2Var.m12183w("statusText", str5);
                                                g83Var2 = ((ia1) ((q11) mi5Var2).f8791b).f4914d;
                                                if (g83Var2 != null) {
                                                    strM1034a = g83.m1034a(g83Var2);
                                                } else {
                                                    hx0Var = ((ia1) ((q11) mi5Var2).f8791b).f4915e;
                                                    if (hx0Var != null) {
                                                        this.f5w = str3;
                                                        this.f6x = (q11) mi5Var2;
                                                        this.f3u = wa2Var;
                                                        this.f4v = (byte) 2;
                                                        objMo3997v = hx0Var.mo3997v(this);
                                                        if (objMo3997v != ap0Var7) {
                                                            mi5Var = mi5Var2;
                                                            wa2VarM1038a = wa2Var;
                                                        }
                                                        return ap0Var7;
                                                    }
                                                    wa2VarM1038a.m12183w("body", strM1034a);
                                                    wa2Var2 = new wa2();
                                                    for (Map.Entry entry : ((ia1) ((q11) mi5Var).f8791b).f4913c.entrySet()) {
                                                        wa2Var2.m12183w((String) entry.getKey(), (String) entry.getValue());
                                                    }
                                                    wa2VarM1038a.m12180t("headers", wa2Var2);
                                                }
                                                mi5Var = mi5Var2;
                                                wa2VarM1038a = wa2Var;
                                                wa2VarM1038a.m12183w("body", strM1034a);
                                                wa2Var2 = new wa2();
                                                while (r1.hasNext()) {
                                                    wa2Var2.m12183w((String) entry.getKey(), (String) entry.getValue());
                                                }
                                                wa2VarM1038a.m12180t("headers", wa2Var2);
                                            } else if (!(mi5Var2 instanceof k11)) {
                                                wa2 wa2Var4 = new wa2();
                                                wa2Var4.m12183w("requestId", str3);
                                                wa2Var4.m12181u(new Integer(((k11) mi5Var2).f6031c), "statusCode");
                                                str4 = ((k11) mi5Var2).f6032d;
                                                if (str4 == null) {
                                                    str4 = "";
                                                }
                                                wa2Var4.m12183w("statusText", str4);
                                                wa2Var4.m12183w("body", "");
                                                wa2Var4.m12180t("headers", new wa2());
                                                wa2VarM1038a = wa2Var4;
                                            } else {
                                                if (!(mi5Var2 instanceof i11)) {
                                                    wa2VarM1038a = C0132ga.m1038a(c0132ga, str3);
                                                    break;
                                                } else {
                                                    try {
                                                        throw new gf0();
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                    }
                                                }
                                                strM1034a = str3;
                                                strMo3532s = strM1034a;
                                                AbstractC0137h.m1108a("Error processing network request from JS", th);
                                                try {
                                                    i82Var2.m6694e("globalThis.__handleNetworkResponse(" + C0132ga.m1038a(c0132ga, strMo3532s) + ");");
                                                } catch (Throwable th9) {
                                                    AbstractC0137h.m1115c("Failed to deliver network error to JS: " + th9.getMessage(), null);
                                                }
                                            }
                                            strM1034a = str3;
                                            i82Var2 = i82Var2;
                                            i82Var2.m6694e("globalThis.__handleNetworkResponse(" + wa2VarM1038a + ");");
                                        } catch (Throwable th10) {
                                            th = th10;
                                        }
                                    } else {
                                        if (b8 != 2) {
                                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        wa2VarM1038a = (wa2) this.f3u;
                                        mi5Var = (q11) this.f6x;
                                        str3 = (String) this.f5w;
                                        k43.m7376J(obj);
                                        objMo3997v = obj;
                                        ju4Var = ju4Var2;
                                        i82Var2 = i82Var2;
                                    }
                                    i82Var2.m6694e("globalThis.__handleNetworkResponse(" + wa2VarM1038a + ");");
                                    break;
                                } catch (Throwable th11) {
                                    th = th11;
                                    try {
                                        AbstractC0137h.m1115c("Failed to deliver network response: " + th.getMessage(), null);
                                    } catch (Throwable th12) {
                                        th = th12;
                                        strMo3532s = strM1034a;
                                        AbstractC0137h.m1108a("Error processing network request from JS", th);
                                        i82Var2.m6694e("globalThis.__handleNetworkResponse(" + C0132ga.m1038a(c0132ga, strMo3532s) + ");");
                                    }
                                }
                                i82Var2 = i82Var2;
                            } catch (Throwable th13) {
                                th = th13;
                                i82Var2 = i82Var2;
                            }
                            g83Var = (g83) objMo3997v;
                            if (g83Var != null) {
                                strM1034a = g83.m1034a(g83Var);
                            } else {
                                wa2Var = wa2VarM1038a;
                                mi5Var2 = mi5Var;
                                mi5Var = mi5Var2;
                                wa2VarM1038a = wa2Var;
                            }
                            wa2VarM1038a.m12183w("body", strM1034a);
                            wa2Var2 = new wa2();
                            while (r1.hasNext()) {
                                wa2Var2.m12183w((String) entry.getKey(), (String) entry.getValue());
                            }
                            wa2VarM1038a.m12180t("headers", wa2Var2);
                            strM1034a = str3;
                        } catch (Throwable th14) {
                            th = th14;
                            strM1034a = str2;
                            ju4Var = ju4Var2;
                        }
                    } else {
                        k43.m7376J(obj);
                        try {
                            strMo3532s = wa2Var3.m12186z("id").mo3532s();
                            try {
                                String strMo3532s4 = wa2Var3.m12186z("method").mo3532s();
                                String strMo3532s5 = wa2Var3.m12186z("url").mo3532s();
                                ba2 ba2VarM12186z = wa2Var3.m12186z("headersJson");
                                if (ba2VarM12186z == null) {
                                    strMo3532s2 = null;
                                } else {
                                    if (ba2VarM12186z instanceof sa2) {
                                        ba2VarM12186z = null;
                                    }
                                    if (ba2VarM12186z != null) {
                                        strMo3532s2 = ba2VarM12186z.mo3532s();
                                    } else {
                                        strMo3532s2 = null;
                                    }
                                }
                                if (strMo3532s2 == null) {
                                    strMo3532s2 = "{}";
                                }
                                ba2 ba2VarM12186z2 = wa2Var3.m12186z("body");
                                if (ba2VarM12186z2 == null) {
                                    strMo3532s3 = null;
                                } else {
                                    if (ba2VarM12186z2 instanceof sa2) {
                                        ba2VarM12186z2 = null;
                                    }
                                    if (ba2VarM12186z2 != null) {
                                        strMo3532s3 = ba2VarM12186z2.mo3532s();
                                    } else {
                                        strMo3532s3 = null;
                                    }
                                }
                                if (strMo3532s3 == null) {
                                    strMo3532s3 = "";
                                }
                                ju4Var = ju4Var2;
                                i82Var2 = i82Var2;
                                try {
                                    Set setEntrySet = ((wa2) ((ou1) c0132ga.f3900c).m9270c(strMo3532s2, new cs4(wa2.class))).f33192a.entrySet();
                                    int iM5779K = fq2.m5779K(ib0.m6717y0(setEntrySet, 10));
                                    if (iM5779K < 16) {
                                        iM5779K = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM5779K);
                                    Iterator it = ((nl2) setEntrySet).iterator();
                                    while (((ml2) it).hasNext()) {
                                        ol2 ol2VarM8344a = ((ml2) it).m8344a();
                                        linkedHashMap.put(ol2VarM8344a.getKey(), ((ba2) ol2VarM8344a.getValue()).mo3532s());
                                    }
                                    byte[] bytes = strMo3532s3.length() > 0 ? strMo3532s3.getBytes(z80.f35863a) : AbstractC0990oo.m9216k0(new String[]{"POST", "PUT", "PATCH"}).contains(strMo3532s4.toUpperCase(Locale.ROOT)) ? new byte[0] : null;
                                    fa1 fa1Var = new fa1();
                                    fa1Var.f3381a = new URL(strMo3532s5);
                                    fa1Var.m895a(strMo3532s4.toUpperCase(Locale.ROOT), bytes);
                                    LinkedHashMap linkedHashMap2 = fa1Var.f3383c;
                                    linkedHashMap2.clear();
                                    linkedHashMap2.putAll(linkedHashMap);
                                    ga1 ga1VarM893a = fa1Var.m893a();
                                    g75 g75Var = (g75) c0132ga.f3899b;
                                    this.f5w = strMo3532s;
                                    this.f4v = (byte) 1;
                                    objM5910b = g75.m5910b(g75Var, ga1VarM893a, null, this, 30);
                                    if (objM5910b != ap0Var7) {
                                        str3 = strMo3532s;
                                        mi5Var2 = (mi5) objM5910b;
                                        if (mi5Var2 instanceof q11) {
                                            wa2Var = new wa2();
                                            wa2Var.m12183w("requestId", str3);
                                            wa2Var.m12181u(new Integer(((ia1) ((q11) mi5Var2).f8791b).f4911a), "statusCode");
                                            str5 = ((ia1) ((q11) mi5Var2).f8791b).f4912b;
                                            if (str5 == null) {
                                                if (((ia1) ((q11) mi5Var2).f8791b).f4911a == 200) {
                                                    str5 = "OK";
                                                } else {
                                                    str5 = "";
                                                }
                                            }
                                            wa2Var.m12183w("statusText", str5);
                                            g83Var2 = ((ia1) ((q11) mi5Var2).f8791b).f4914d;
                                            if (g83Var2 != null) {
                                                strM1034a = g83.m1034a(g83Var2);
                                            } else {
                                                hx0Var = ((ia1) ((q11) mi5Var2).f8791b).f4915e;
                                                if (hx0Var != null) {
                                                    this.f5w = str3;
                                                    this.f6x = (q11) mi5Var2;
                                                    this.f3u = wa2Var;
                                                    this.f4v = (byte) 2;
                                                    objMo3997v = hx0Var.mo3997v(this);
                                                    if (objMo3997v != ap0Var7) {
                                                        mi5Var = mi5Var2;
                                                        wa2VarM1038a = wa2Var;
                                                        g83Var = (g83) objMo3997v;
                                                        if (g83Var != null) {
                                                            strM1034a = g83.m1034a(g83Var);
                                                        } else {
                                                            wa2Var = wa2VarM1038a;
                                                            mi5Var2 = mi5Var;
                                                        }
                                                    }
                                                }
                                                wa2VarM1038a.m12183w("body", strM1034a);
                                                wa2Var2 = new wa2();
                                                while (r1.hasNext()) {
                                                    wa2Var2.m12183w((String) entry.getKey(), (String) entry.getValue());
                                                }
                                                wa2VarM1038a.m12180t("headers", wa2Var2);
                                            }
                                            mi5Var = mi5Var2;
                                            wa2VarM1038a = wa2Var;
                                            wa2VarM1038a.m12183w("body", strM1034a);
                                            wa2Var2 = new wa2();
                                            while (r1.hasNext()) {
                                                wa2Var2.m12183w((String) entry.getKey(), (String) entry.getValue());
                                            }
                                            wa2VarM1038a.m12180t("headers", wa2Var2);
                                        } else if (!(mi5Var2 instanceof k11)) {
                                            if (!(mi5Var2 instanceof i11)) {
                                                throw new gf0();
                                            }
                                            wa2VarM1038a = C0132ga.m1038a(c0132ga, str3);
                                            break;
                                            strM1034a = str3;
                                            strMo3532s = strM1034a;
                                            AbstractC0137h.m1108a("Error processing network request from JS", th);
                                            i82Var2.m6694e("globalThis.__handleNetworkResponse(" + C0132ga.m1038a(c0132ga, strMo3532s) + ");");
                                        } else {
                                            wa2 wa2Var5 = new wa2();
                                            wa2Var5.m12183w("requestId", str3);
                                            wa2Var5.m12181u(new Integer(((k11) mi5Var2).f6031c), "statusCode");
                                            str4 = ((k11) mi5Var2).f6032d;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            wa2Var5.m12183w("statusText", str4);
                                            wa2Var5.m12183w("body", "");
                                            wa2Var5.m12180t("headers", new wa2());
                                            wa2VarM1038a = wa2Var5;
                                        }
                                        strM1034a = str3;
                                        i82Var2 = i82Var2;
                                        i82Var2.m6694e("globalThis.__handleNetworkResponse(" + wa2VarM1038a + ");");
                                        break;
                                    }
                                    return ap0Var7;
                                } catch (Throwable th15) {
                                    th = th15;
                                    i82Var2 = i82Var2;
                                    AbstractC0137h.m1108a("Error processing network request from JS", th);
                                    i82Var2.m6694e("globalThis.__handleNetworkResponse(" + C0132ga.m1038a(c0132ga, strMo3532s) + ");");
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                ju4Var = ju4Var2;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            ju4Var = ju4Var2;
                        }
                    }
                    break;
                } catch (Throwable th18) {
                    th = th18;
                    strM1034a = str;
                    i82Var2 = i82Var;
                }
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(od1 od1Var, C1354y3 c1354y3, u93 u93Var, gr1 gr1Var, sw2 sw2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f2t = (byte) 4;
        this.f5w = od1Var;
        this.f6x = c1354y3;
        this.f7y = u93Var;
        this.f8z = gr1Var;
        this.f1A = sw2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(ex2 ex2Var, yp1 yp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f2t = (byte) 3;
        yw2 yw2Var = yw2.f35566a;
        this.f8z = ex2Var;
        this.f1A = yp1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a00(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f2t = b;
        this.f7y = obj;
        this.f8z = obj2;
        this.f1A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(f71 f71Var, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f2t = (byte) 5;
        this.f8z = f71Var;
        this.f1A = mq1Var;
    }
}
