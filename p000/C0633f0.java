package p000;

import ads_mobile_sdk.ff3;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: f0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0633f0 extends xq1 implements yp1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f18621b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0633f0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f18621b = b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        Object[] objArr;
        xd0 xd0Var;
        oc2 oc2VarMo204q;
        Integer numValueOf;
        byte b = this.f18621b;
        byte b2 = 3;
        boolean z = true;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.receiver;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC0892m0 abstractC0892m0 = (AbstractC0892m0) obj2;
                sv2 sv2Var = abstractC0892m0.f24494E;
                if (zBooleanValue) {
                    abstractC0892m0.m8163Z0();
                } else {
                    if (abstractC0892m0.f24500q != null) {
                        Object[] objArr2 = sv2Var.f30591c;
                        long[] jArr = sv2Var.f30589a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8;
                                    int i3 = 8 - ((~(i - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((j & 255) < 128) {
                                            lb5.m7910S(abstractC0892m0.m8391C0(), null, null, new C0818k0(abstractC0892m0, (ff3) objArr2[(i << 3) + i4], b5 == true ? 1 : 0, b3), 3);
                                        }
                                        j >>= i2;
                                        i4++;
                                        i2 = i2;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i3 == i2) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i != length) {
                                    i++;
                                    objArr2 = objArr;
                                }
                            }
                        }
                        ff3 ff3Var = abstractC0892m0.f24496G;
                        if (ff3Var != null) {
                            lb5.m7910S(abstractC0892m0.m8391C0(), null, null, new C0818k0(abstractC0892m0, ff3Var, b4 == true ? 1 : 0, (byte) 1), 3);
                        }
                    }
                    sv2Var.m10921a();
                    abstractC0892m0.f24496G = null;
                    abstractC0892m0.mo8164a1();
                }
                return ju4Var;
            case 1:
                ((C1328xe) obj2).m12676d((h70) obj);
                return ju4Var;
            case 2:
                ((C1328xe) obj2).m12676d((h70) obj);
                return ju4Var;
            case 3:
                return ((wc0) obj2).m12213l((y41) obj);
            case 4:
                return ((wc0) obj2).m12213l((y41) obj);
            case 5:
                return ((wc0) obj2).m12213l((y41) obj);
            case 6:
                return ((wc0) obj2).m12213l((y41) obj);
            case 7:
                return ((wc0) obj2).m12213l((y41) obj);
            case 8:
                return ((wc0) obj2).m12213l((y41) obj);
            case 9:
                return ((wc0) obj2).m12213l((y41) obj);
            case 10:
                return ((wc0) obj2).m12213l((y41) obj);
            case 11:
                return ((wc0) obj2).m12213l((y41) obj);
            case 12:
                return ((wc0) obj2).m12213l((y41) obj);
            case 13:
                return ((wc0) obj2).m12213l((y41) obj);
            case 14:
                return ((wc0) obj2).m12213l((y41) obj);
            case 15:
                return ((wc0) obj2).m12213l((y41) obj);
            case 16:
                return ((wc0) obj2).m12213l((y41) obj);
            case 17:
                return ((wc0) obj2).m12213l((y41) obj);
            case 18:
                return ((wc0) obj2).m12213l((y41) obj);
            case 19:
                return ((wc0) obj2).m12213l((y41) obj);
            case 20:
                return ((wc0) obj2).m12213l((y41) obj);
            case 21:
                n72 n72Var = (n72) obj2;
                ReentrantLock reentrantLock = n72Var.f25493d;
                reentrantLock.lock();
                try {
                    List listM6319e1 = hb0.m6319e1(n72Var.f25492c.values());
                    reentrantLock.unlock();
                    Iterator it = listM6319e1.iterator();
                    if (!it.hasNext()) {
                        return ju4Var;
                    }
                    ((a33) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 22:
                ((w82) obj2).mo3515o((Throwable) obj);
                return ju4Var;
            case 23:
                long j2 = ((b33) obj).f15059a;
                ij4 ij4Var = (ij4) obj2;
                ij4Var.getClass();
                mj4 mj4Var = (mj4) sj3.m10825u(ij4Var, nj4.f25890a);
                if (mj4Var != null) {
                    hj4 hj4Var = new hj4();
                    hj4Var.f20629b = ij4Var;
                    hj4Var.f20628a = j2;
                    VarHandle.storeStoreFence();
                    lb5.m7910S(ij4Var.m8391C0(), null, null, new C0708h0(ij4Var, j2, mj4Var, hj4Var, null), 3);
                }
                return ju4Var;
            case 24:
                ((bj4) obj2).f15335b.m4200a((yp1) obj);
                return ju4Var;
            case 25:
                KeyEvent keyEvent = ((sc2) obj).f30158a;
                ak4 ak4Var = (ak4) obj2;
                pl4 pl4Var = ak4Var.f14593f;
                boolean z2 = ak4Var.f14591d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    xd0Var = null;
                } else {
                    yu0 yu0Var = ak4Var.f14596i;
                    yu0Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        yu0Var.f35527a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = yu0Var.f35527a;
                        if (num != null) {
                            yu0Var.f35527a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        xd0Var = new xd0(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        xd0Var = null;
                    }
                }
                if (xd0Var != null) {
                    if (z2) {
                        ak4Var.m3041a(Collections.singletonList(xd0Var));
                        pl4Var.f27737a = null;
                    } else {
                        z = false;
                    }
                } else if (qs5.m10083H(keyEvent) != 2 || (oc2VarMo204q = ak4Var.f14597j.mo204q(keyEvent)) == null || (oc2VarMo204q.f26622a && !z2)) {
                    z = false;
                } else {
                    ml3 ml3Var = new ml3();
                    ml3Var.f25002a = true;
                    bh4 bh4Var = new bh4(b2);
                    bh4Var.f15274b = oc2VarMo204q;
                    bh4Var.f15275c = ak4Var;
                    bh4Var.f15276d = ml3Var;
                    VarHandle.storeStoreFence();
                    xk4 xk4Var = ak4Var.f14590c;
                    vi3 vi3Var = ak4Var.f14594g;
                    kl4 kl4VarM11577d = ak4Var.f14588a.m11577d();
                    C0875lk c0875lk = xk4Var.f34341a;
                    long j3 = xk4Var.f34342b;
                    jl4 jl4Var = kl4VarM11577d != null ? kl4VarM11577d.f23216a : null;
                    dk4 dk4Var = new dk4();
                    dk4Var.f17121a = c0875lk;
                    dk4Var.f17122b = j3;
                    dk4Var.f17123c = jl4Var;
                    dk4Var.f17124d = vi3Var;
                    dk4Var.f17125e = pl4Var;
                    dk4Var.f17126f = j3;
                    dk4Var.f17127g = c0875lk;
                    dk4Var.f17128h = xk4Var;
                    dk4Var.f17129i = kl4VarM11577d;
                    VarHandle.storeStoreFence();
                    bh4Var.invoke(dk4Var);
                    if (!ql4.m9899c(dk4Var.f17126f, j3) || !z62.m13387o(c0875lk, xk4Var.f34341a)) {
                        ak4Var.f14598k.invoke(xk4.m12702a(xk4Var, c0875lk, dk4Var.f17126f, 4));
                    }
                    ak4Var.f14595h.f14885e = true;
                    z = ml3Var.f25002a;
                }
                return Boolean.valueOf(z);
            default:
                ((ff3) obj2).m924b((i82) obj);
                return ju4Var;
        }
    }
}
