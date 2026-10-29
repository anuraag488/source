package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import essentials.accessibility.EsAccessibilityService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 implements ti1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18876a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18877b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18878c;

    public /* synthetic */ fa1(byte b) {
        this.f18876a = b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m5622a(int i, wm0 wm0Var) {
        sb4 sb4Var;
        if (wm0Var instanceof sb4) {
            sb4Var = (sb4) wm0Var;
            int i2 = sb4Var.f30069v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sb4Var.f30069v = i2 - Integer.MIN_VALUE;
            } else {
                sb4Var = new sb4(this, wm0Var);
            }
        } else {
            sb4Var = new sb4(this, wm0Var);
        }
        Object obj = sb4Var.f30067t;
        ap0 ap0Var = ap0.f14763a;
        int i3 = sb4Var.f30069v;
        ju4 ju4Var = ju4.f22634a;
        if (i3 != 0) {
            if (i3 == 1) {
                k43.m7376J(obj);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        if (i > 0) {
            ml3 ml3Var = (ml3) this.f18877b;
            if (!ml3Var.f25002a) {
                ml3Var.f25002a = true;
                ti1 ti1Var = (ti1) this.f18878c;
                j54 j54Var = j54.f22029a;
                sb4Var.f30069v = 1;
                if (ti1Var.emit(j54Var, sb4Var) == ap0Var) {
                    return ap0Var;
                }
            }
        }
        return ju4Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011d, code lost:
    
        if (r12.emit(r13, r0) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d2, code lost:
    
        if (r12.emit(r13, r0) == r4) goto L98;
     */
    @Override // p000.ti1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, wm0 wm0Var) {
        gj1 gj1Var;
        nj1 nj1Var;
        rj1 rj1Var;
        wj1 wj1Var;
        ti1 ti1Var;
        byte b = this.f18876a;
        int i = 0;
        int i2 = 0;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                l73 l73Var = (l73) obj;
                int iIntValue = ((Number) l73Var.f23833a).intValue();
                int iIntValue2 = ((Number) l73Var.f23834b).intValue();
                EsAccessibilityService esAccessibilityService = (EsAccessibilityService) this.f18877b;
                xn2 xn2Var = esAccessibilityService.f18446c;
                if (xn2Var != null) {
                    C1354y3 c1354y3 = (C1354y3) this.f18878c;
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "update configs " + c1354y3.f34831d, null);
                    }
                }
                AccessibilityServiceInfo serviceInfo = esAccessibilityService.getServiceInfo();
                serviceInfo.eventTypes = iIntValue;
                serviceInfo.flags = iIntValue2;
                esAccessibilityService.setServiceInfo(serviceInfo);
                return ju4Var;
            case 1:
                if (wm0Var instanceof gj1) {
                    gj1Var = (gj1) wm0Var;
                    int i3 = gj1Var.f19819v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gj1Var.f19819v = i3 - Integer.MIN_VALUE;
                    } else {
                        gj1Var = new gj1(this, wm0Var);
                    }
                } else {
                    gj1Var = new gj1(this, wm0Var);
                }
                Object obj2 = gj1Var.f19817t;
                ap0 ap0Var = ap0.f14763a;
                int i4 = gj1Var.f19819v;
                if (i4 == 0) {
                    k43.m7376J(obj2);
                    ol3 ol3Var = (ol3) this.f18877b;
                    int i5 = ol3Var.f26851a;
                    if (i5 >= 1) {
                        ti1 ti1Var2 = (ti1) this.f18878c;
                        gj1Var.f19819v = 1;
                        if (ti1Var2.emit(obj, gj1Var) == ap0Var) {
                            return ap0Var;
                        }
                    } else {
                        ol3Var.f26851a = i5 + 1;
                    }
                } else {
                    if (i4 != 1) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj2);
                }
                return ju4Var;
            case 2:
                if (wm0Var instanceof nj1) {
                    nj1Var = (nj1) wm0Var;
                    int i6 = nj1Var.f25881u;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        nj1Var.f25881u = i6 - Integer.MIN_VALUE;
                    } else {
                        nj1Var = new nj1(this, wm0Var);
                    }
                } else {
                    nj1Var = new nj1(this, wm0Var);
                }
                Object objInvoke = nj1Var.f25880t;
                ap0 ap0Var2 = ap0.f14763a;
                int i7 = nj1Var.f25881u;
                if (i7 == 0) {
                    k43.m7376J(objInvoke);
                    C1108rh c1108rh = (C1108rh) this.f18877b;
                    nj1Var.f25883w = obj;
                    nj1Var.f25884x = 0;
                    nj1Var.f25881u = 1;
                    objInvoke = c1108rh.invoke(obj, nj1Var);
                    if (objInvoke != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (i7 == 1) {
                    i = nj1Var.f25884x;
                    obj = nj1Var.f25883w;
                    k43.m7376J(objInvoke);
                } else {
                    if (i7 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(objInvoke);
                }
                return ju4Var;
                if (!((Boolean) objInvoke).booleanValue()) {
                    throw new C0817k(this);
                }
                ti1 ti1Var3 = (ti1) this.f18878c;
                nj1Var.f25883w = null;
                nj1Var.f25884x = i;
                nj1Var.f25881u = 2;
                break;
                break;
            case 3:
                if (wm0Var instanceof rj1) {
                    rj1Var = (rj1) wm0Var;
                    int i8 = rj1Var.f29350u;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        rj1Var.f29350u = i8 - Integer.MIN_VALUE;
                    } else {
                        rj1Var = new rj1(this, wm0Var);
                    }
                } else {
                    rj1Var = new rj1(this, wm0Var);
                }
                Object objInvoke2 = rj1Var.f29349t;
                ap0 ap0Var3 = ap0.f14763a;
                int i9 = rj1Var.f29350u;
                if (i9 == 0) {
                    k43.m7376J(objInvoke2);
                    mq1 mq1Var = (mq1) this.f18877b;
                    rj1Var.f29352w = obj;
                    rj1Var.f29350u = 1;
                    objInvoke2 = mq1Var.invoke(obj, rj1Var);
                    if (objInvoke2 == ap0Var3) {
                        return ap0Var3;
                    }
                } else {
                    if (i9 != 1) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = rj1Var.f29352w;
                    k43.m7376J(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return ju4Var;
                }
                ((ql3) this.f18878c).f28555a = obj;
                throw new C0817k(this);
            case 4:
                if (wm0Var instanceof wj1) {
                    wj1Var = (wj1) wm0Var;
                    int i10 = wj1Var.f33424u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        wj1Var.f33424u = i10 - Integer.MIN_VALUE;
                    } else {
                        wj1Var = new wj1(this, wm0Var);
                    }
                } else {
                    wj1Var = new wj1(this, wm0Var);
                }
                Object obj3 = wj1Var.f33423t;
                ap0 ap0Var4 = ap0.f14763a;
                int i11 = wj1Var.f33424u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i2 = wj1Var.f33428y;
                        ti1Var = wj1Var.f33427x;
                        obj = wj1Var.f33426w;
                        k43.m7376J(obj3);
                    } else {
                        if (i11 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj3);
                    }
                    return ju4Var;
                }
                k43.m7376J(obj3);
                ti1 ti1Var4 = (ti1) this.f18877b;
                wp4 wp4Var = (wp4) this.f18878c;
                wj1Var.f33426w = obj;
                wj1Var.f33427x = ti1Var4;
                wj1Var.f33428y = 0;
                wj1Var.f33424u = 1;
                wp4Var.invoke(obj, wj1Var);
                if (ju4Var != ap0Var4) {
                    ti1Var = ti1Var4;
                }
                return ap0Var4;
                wj1Var.f33426w = null;
                wj1Var.f33427x = null;
                wj1Var.f33428y = i2;
                wj1Var.f33424u = 2;
                break;
            case 5:
                long j = ((b33) obj).f15059a;
                C0910mi c0910mi = (C0910mi) this.f18877b;
                if ((((b33) c0910mi.m8328d()).f15059a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((b33) c0910mi.m8328d()).f15059a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objM8330f = c0910mi.m8330f(wm0Var, b33.m3423a(j));
                    return objM8330f == ap0.f14763a ? objM8330f : ju4Var;
                }
                lb5.m7910S((zo0) this.f18878c, null, null, new C0455ai((byte) 2, j, null, c0910mi), 3);
                return ju4Var;
            case 6:
                return m5622a(((Number) obj).intValue(), wm0Var);
            case 7:
                c62 c62Var = (c62) obj;
                ol3 ol3Var2 = (ol3) this.f18877b;
                if (c62Var instanceof ff3) {
                    ol3Var2.f26851a++;
                } else if ((c62Var instanceof gf3) || (c62Var instanceof ef3)) {
                    ol3Var2.f26851a--;
                }
                boolean z = ol3Var2.f26851a > 0;
                rm4 rm4Var = (rm4) this.f18878c;
                if (rm4Var.f29422r != z) {
                    rm4Var.f29422r = z;
                    z62.m13349H(rm4Var);
                }
                return ju4Var;
            default:
                ((x33) this.f18877b).mo6394b((q25) this.f18878c, (ql0) obj);
                return ju4Var;
        }
    }
}
