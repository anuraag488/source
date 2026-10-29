package p000;

import ads_mobile_sdk.EnumC0071cu;
import android.content.Context;
import java.io.EOFException;
import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q50 implements l50, qo0, jm0, w81, ye4, jf3, bb4, cr0, t65, pe5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28222a;

    public q50(float f, float f2) {
        this.f28222a = (byte) 1;
        if (f <= f2) {
            return;
        }
        C1077qn.m9987m("min must be less than or equal to max");
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static String m9725g(String str, int i, int i2, String str2, int i3) throws EOFException {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            int i6 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || hd4.m6336b0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !m9727i(iCharCount, str, length)))) || (iCodePointAt == 43 && z3)))) {
                w30 w30Var = new w30();
                w30Var.m12057R(i4, str, iCharCount);
                w30 w30Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            w30Var.m12058S(z ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z4) || hd4.m6336b0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !m9727i(iCharCount, str, length)))))) {
                            if (w30Var2 == null) {
                                w30Var2 = new w30();
                            }
                            w30Var2.m12059T(iCodePointAt2);
                            while (!w30Var2.m12062e()) {
                                byte bM12067q = w30Var2.m12067q();
                                w30Var.m12054O(37);
                                char[] cArr = dz1.f17517j;
                                w30Var.m12054O(cArr[((bM12067q & 255) >> 4) & 15]);
                                w30Var.m12054O(cArr[bM12067q & 15]);
                            }
                        } else {
                            w30Var.m12059T(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                    i6 = 32;
                }
                return w30Var.m12047C(w30Var.f33056b, z80.f35863a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    /* JADX INFO: renamed from: h */
    public static q50 m9726h(C1135s7 c1135s7) throws GeneralSecurityException {
        Provider providerM13360S = z62.m13360S();
        if (providerM13360S == null) {
            xy4.m12788q("Conscrypt not available");
            return null;
        }
        Mac.getInstance("AESCMAC", providerM13360S);
        byte[] bArrM11250c = ((u50) c1135s7.f29938v.f33259b).m11250c();
        q50 q50Var = new q50((byte) 15);
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            return null;
        }
        new SecretKeySpec(bArrM11250c, "AES");
        VarHandle.storeStoreFence();
        return q50Var;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9727i(int i, String str, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && zv4.m13821p(str.charAt(i + 1)) != -1 && zv4.m13821p(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: k */
    public static String m9728k(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                w30 w30Var = new w30();
                w30Var.m12057R(i, str, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM13821p = zv4.m13821p(str.charAt(iCharCount + 1));
                        int iM13821p2 = zv4.m13821p(str.charAt(i4));
                        if (iM13821p == -1 || iM13821p2 == -1) {
                            w30Var.m12059T(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            w30Var.m12054O((iM13821p << 4) + iM13821p2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        w30Var.m12054O(32);
                        iCharCount++;
                    } else {
                        w30Var.m12059T(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return w30Var.m12047C(w30Var.f33056b, z80.f35863a);
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m9729m(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM6342h0 = hd4.m6342h0(str, '&', i, 4);
            if (iM6342h0 == -1) {
                iM6342h0 = str.length();
            }
            int iM6342h1 = hd4.m6342h0(str, '=', i, 4);
            if (iM6342h1 == -1 || iM6342h1 > iM6342h0) {
                arrayList.add(str.substring(i, iM6342h0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM6342h1));
                arrayList.add(str.substring(iM6342h1 + 1, iM6342h0));
            }
            i = iM6342h0 + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static void m9730n(ArrayList arrayList, StringBuilder sb) {
        p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, arrayList.size()), 2);
        int i = p52VarM10654Z.f27382a;
        int i2 = p52VarM10654Z.f27383b;
        int i3 = p52VarM10654Z.f27384c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(i);
            String str2 = (String) arrayList.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    @Override // p000.ye4
    /* JADX INFO: renamed from: a */
    public ze4 mo9571a(xe4 xe4Var) {
        Context context = xe4Var.f34206a;
        String str = xe4Var.f34207b;
        hf0 hf0Var = xe4Var.f34208c;
        boolean z = xe4Var.f34209d;
        boolean z2 = xe4Var.f34210e;
        zo1 zo1Var = new zo1();
        zo1Var.f36213a = context;
        zo1Var.f36214b = str;
        zo1Var.f36215c = hf0Var;
        zo1Var.f36216d = z;
        zo1Var.f36217e = z2;
        C1053q c1053q = new C1053q((byte) 28);
        c1053q.f28113b = zo1Var;
        VarHandle.storeStoreFence();
        zo1Var.f36218f = new dg4(c1053q);
        VarHandle.storeStoreFence();
        return zo1Var;
    }

    @Override // p000.l50
    /* JADX INFO: renamed from: b */
    public byte[] mo6231b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.jm0
    /* JADX INFO: renamed from: c */
    public long mo6670c(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = sv3.f30595a;
            return jFloatToRawIntBits;
        }
        float fM13036p = y70.m13036p(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM13036p)) << 32) | (((long) Float.floatToRawIntBits(fM13036p)) & 4294967295L);
        int i2 = sv3.f30595a;
        return jFloatToRawIntBits2;
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: d */
    public Object mo5607d(String str, Provider provider) {
        switch (this.f28222a) {
            case 6:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // p000.pe5
    /* JADX INFO: renamed from: e */
    public byte[] mo9502e(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.bb4
    /* JADX INFO: renamed from: f */
    public Iterator mo3538f(wd3 wd3Var, CharSequence charSequence) {
        return new za4(wd3Var, charSequence);
    }

    /* JADX INFO: renamed from: j */
    public j62 m9731j(long j, Object obj) {
        j62 j62Var = (j62) dv4.m4758h(j, obj);
        if (((AbstractC0596e2) j62Var).f17637a) {
            return j62Var;
        }
        int size = j62Var.size();
        th3 th3VarM11051c = ((th3) j62Var).m11051c(size == 0 ? 10 : size * 2);
        dv4.m4765o(j, obj, th3VarM11051c);
        return th3VarM11051c;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0062->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0062). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: l */
    public Object m9732l(List list, qt0 qt0Var, ym0 ym0Var) throws Throwable {
        ht0 ht0Var;
        ArrayList arrayList;
        Iterator it;
        ql3 ql3Var;
        Throwable th;
        yp1 yp1Var;
        if (ym0Var instanceof ht0) {
            ht0Var = (ht0) ym0Var;
            int i = ht0Var.f20841y;
            if ((i & Integer.MIN_VALUE) != 0) {
                ht0Var.f20841y = i - Integer.MIN_VALUE;
            } else {
                ht0Var = new ht0(this, ym0Var);
            }
        } else {
            ht0Var = new ht0(this, ym0Var);
        }
        Object obj = ht0Var.f20839w;
        Object obj2 = ap0.f14763a;
        int i2 = ht0Var.f20841y;
        byte b = 1;
        wm0 wm0Var = null;
        if (i2 == 0) {
            k43.m7376J(obj);
            ArrayList arrayList2 = new ArrayList();
            C0667fx c0667fx = new C0667fx(list, arrayList2, wm0Var, b);
            ht0Var.f20836t = arrayList2;
            ht0Var.f20841y = 1;
            if (qt0Var.m10122a(c0667fx, ht0Var) != obj2) {
                arrayList = arrayList2;
            }
            return obj2;
        }
        if (i2 == 1) {
            arrayList = ht0Var.f20836t;
            k43.m7376J(obj);
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = ht0Var.f20838v;
            ql3Var = ht0Var.f20837u;
            try {
                k43.m7376J(obj);
            } catch (Throwable th2) {
                Object obj3 = ql3Var.f28555a;
                if (obj3 == null) {
                    ql3Var.f28555a = th2;
                } else {
                    se0.m10720f((Throwable) obj3, th2);
                }
            }
        }
        while (it.hasNext()) {
            yp1Var = (yp1) it.next();
            ht0Var.f20836t = null;
            ht0Var.f20837u = ql3Var;
            ht0Var.f20838v = it;
            ht0Var.f20841y = 2;
            if (yp1Var.invoke(ht0Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) ql3Var.f28555a;
        if (th == null) {
            return ju4.f22634a;
        }
        throw th;
        ql3 ql3Var2 = new ql3();
        it = arrayList.iterator();
        ql3Var = ql3Var2;
        while (it.hasNext()) {
            yp1Var = (yp1) it.next();
            ht0Var.f20836t = null;
            ht0Var.f20837u = ql3Var;
            ht0Var.f20838v = it;
            ht0Var.f20841y = 2;
            if (yp1Var.invoke(ht0Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) ql3Var.f28555a;
        if (th == null) {
            return ju4.f22634a;
        }
        throw th;
    }

    public String toString() {
        switch (this.f28222a) {
            case 2:
                return "CompositionErrorContext";
            case 22:
                int iHashCode = hashCode();
                y62.m12992v(16);
                return zi4.m13622v("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rl3.m10361a(String.class).m10249b(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q50(byte b) {
        this.f28222a = b;
    }

    @Override // p000.t65
    /* JADX INFO: renamed from: a */
    public Object mo5605a(int i) {
        EnumC0071cu enumC0071cu;
        EnumC0071cu enumC0071cu2 = EnumC0071cu.f2280b;
        if (i != 0) {
            enumC0071cu = i != 1 ? null : EnumC0071cu.f2281c;
        } else {
            enumC0071cu = enumC0071cu2;
        }
        return enumC0071cu == null ? enumC0071cu2 : enumC0071cu;
    }
}
