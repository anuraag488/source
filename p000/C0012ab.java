package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: ab */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0012ab implements ti1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f225a;

    /* JADX INFO: renamed from: b */
    public Object f226b;

    /* JADX INFO: renamed from: c */
    public Object f227c;

    /* JADX INFO: renamed from: d */
    public Object f228d;

    public /* synthetic */ C0012ab(byte b) {
        this.f225a = b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0187  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d6  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0165, code lost:
    
        if (r0.emit(r2, r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
    
        if (r3.emit(r1, r10) == r7) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e1, code lost:
    
        if (r3.emit(r0, r10) == r7) goto L89;
     */
    @Override // p000.ti1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, wm0 wm0Var) throws Throwable {
        C1398za c1398za;
        hj1 hj1Var;
        Object obj2;
        gk1 gk1Var;
        ti1 ti1Var;
        ju4 ju4Var;
        char c;
        Object obj3 = obj;
        byte b = this.f225a;
        ju4 ju4Var2 = ju4.f22634a;
        switch (b) {
            case 0:
                ql3 ql3Var = (ql3) this.f226b;
                if (wm0Var instanceof C1398za) {
                    c1398za = (C1398za) wm0Var;
                    int i = c1398za.f35905x;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1398za.f35905x = i - Integer.MIN_VALUE;
                    } else {
                        c1398za = new C1398za(this, wm0Var);
                    }
                } else {
                    c1398za = new C1398za(this, wm0Var);
                }
                Object obj4 = c1398za.f35903v;
                ap0 ap0Var = ap0.f14763a;
                int i2 = c1398za.f35905x;
                if (i2 == 0) {
                    k43.m7376J(obj4);
                    t82 t82Var = (t82) ql3Var.f28555a;
                    if (t82Var != null) {
                        t82Var.mo4993a(new C1175ta());
                        c1398za.f35901t = obj3;
                        c1398za.f35902u = t82Var;
                        c1398za.f35905x = 1;
                        if (t82Var.mo5005t(c1398za) == ap0Var) {
                            return ap0Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t82 t82Var2 = c1398za.f35902u;
                    obj3 = c1398za.f35901t;
                    k43.m7376J(obj4);
                }
                zo0 zo0Var = (zo0) this.f227c;
                ql3Var.f28555a = lb5.m7910S(zo0Var, null, cp0.f16328d, new C0671g0((mq1) this.f228d, obj3, zo0Var, null, (byte) 1), 1);
                return ju4Var2;
            case 1:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                dp4 dp4Var = (dp4) this.f227c;
                ((lg3) this.f226b).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((mq1) ((sw2) this.f228d).getValue()).invoke(dp4Var.f17258a.mo11188l(), dp4Var.f17261d.getValue())).booleanValue() : false));
                return ju4Var2;
            case 2:
                ti1 ti1Var2 = (ti1) this.f227c;
                ml3 ml3Var = (ml3) this.f226b;
                if (wm0Var instanceof hj1) {
                    hj1Var = (hj1) wm0Var;
                    int i3 = hj1Var.f20624w;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        hj1Var.f20624w = i3 - Integer.MIN_VALUE;
                    } else {
                        hj1Var = new hj1(this, wm0Var);
                    }
                } else {
                    hj1Var = new hj1(this, wm0Var);
                }
                Object objInvoke = hj1Var.f20622u;
                ap0 ap0Var2 = ap0.f14763a;
                int i4 = hj1Var.f20624w;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            obj2 = hj1Var.f20621t;
                            k43.m7376J(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                ml3Var.f25002a = true;
                                hj1Var.f20621t = null;
                                hj1Var.f20624w = 3;
                                break;
                            }
                            return ju4Var2;
                        }
                        if (i4 != 3) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    k43.m7376J(objInvoke);
                    return ju4Var2;
                }
                k43.m7376J(objInvoke);
                if (ml3Var.f25002a) {
                    hj1Var.f20621t = null;
                    hj1Var.f20624w = 1;
                    break;
                } else {
                    mq1 mq1Var = (mq1) this.f228d;
                    hj1Var.f20621t = obj3;
                    hj1Var.f20624w = 2;
                    objInvoke = mq1Var.invoke(obj3, hj1Var);
                    if (objInvoke != ap0Var2) {
                        obj2 = obj3;
                        if (!((Boolean) objInvoke).booleanValue()) {
                            ml3Var.f25002a = true;
                            hj1Var.f20621t = null;
                            hj1Var.f20624w = 3;
                            break;
                        }
                        return ju4Var2;
                    }
                }
                return ap0Var2;
            case 3:
                if (wm0Var instanceof gk1) {
                    gk1Var = (gk1) wm0Var;
                    int i5 = gk1Var.f19829u;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        gk1Var.f19829u = i5 - Integer.MIN_VALUE;
                    } else {
                        gk1Var = new gk1(this, wm0Var);
                    }
                } else {
                    gk1Var = new gk1(this, wm0Var);
                }
                Object obj5 = gk1Var.f19828t;
                ap0 ap0Var3 = ap0.f14763a;
                int i6 = gk1Var.f19829u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ti1Var = gk1Var.f19830v;
                        k43.m7376J(obj5);
                    } else {
                        if (i6 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj5);
                    }
                    return ju4Var2;
                }
                k43.m7376J(obj5);
                ti1 ti1Var3 = (ti1) this.f226b;
                WorkDatabase workDatabase = (WorkDatabase) this.f227c;
                ro4 ro4Var = (ro4) this.f228d;
                gk1Var.f19830v = ti1Var3;
                gk1Var.f19829u = 1;
                Object objM3232K = as4.m3232K(workDatabase, true, ro4Var, gk1Var);
                if (objM3232K != ap0Var3) {
                    obj5 = objM3232K;
                    ti1Var = ti1Var3;
                }
                return ap0Var3;
                gk1Var.f19830v = null;
                gk1Var.f19829u = 2;
                break;
            case 4:
                ((Boolean) obj3).getClass();
                C0874lj c0874lj = new C0874lj((wv3) ((dp4) this.f226b).f17261d.getValue());
                y94 y94Var = (y94) this.f227c;
                for (C0874lj c0874lj2 : hb0.m6319e1(y94Var.f35054c)) {
                    if (!z62.m13387o(c0874lj2, c0874lj)) {
                        y94Var.remove(c0874lj2);
                    }
                }
                xv2 xv2Var = (xv2) this.f228d;
                long[] jArr = xv2Var.f34639a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return ju4Var2;
                }
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    char c2 = 7;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj6 = xv2Var.f34640b[i10];
                                c = c2;
                                float f = xv2Var.f34641c[i10];
                                if (!z62.m13387o((C0874lj) obj6, c0874lj)) {
                                    xv2Var.f34643e--;
                                    long[] jArr2 = xv2Var.f34639a;
                                    int i11 = xv2Var.f34642d;
                                    int i12 = i10 >> 3;
                                    int i13 = (i10 & 7) << 3;
                                    ju4Var2 = ju4Var2;
                                    long j2 = (jArr2[i12] & (~(255 << i13))) | (254 << i13);
                                    jArr2[i12] = j2;
                                    jArr2[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j2;
                                    xv2Var.f34640b[i10] = null;
                                }
                                j >>= 8;
                                i9++;
                                c2 = c;
                                ju4Var2 = ju4Var2;
                            } else {
                                c = c2;
                            }
                            j >>= 8;
                            i9++;
                            c2 = c;
                            ju4Var2 = ju4Var2;
                        }
                        ju4Var = ju4Var2;
                        if (i8 != 8) {
                            return ju4Var;
                        }
                    } else {
                        ju4Var = ju4Var2;
                    }
                    if (i7 == length) {
                        return ju4Var;
                    }
                    i7++;
                    ju4Var2 = ju4Var;
                }
                break;
            default:
                Object objM4702d0 = dt0.m4702d0((ro0) this.f226b, obj3, this.f227c, (vp4) this.f228d, wm0Var);
                return objM4702d0 == ap0.f14763a ? objM4702d0 : ju4Var2;
        }
    }
}
