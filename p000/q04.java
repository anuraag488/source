package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q04 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ byte f28127u = 0;

    /* JADX INFO: renamed from: v */
    public byte f28128v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f28129w;

    /* JADX INFO: renamed from: x */
    public Object f28130x;

    /* JADX INFO: renamed from: y */
    public Object f28131y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f28132z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q04(C0795je c0795je, rd6 rd6Var, yj4 yj4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f28130x = c0795je;
        this.f28131y = rd6Var;
        this.f28132z = yj4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f28127u;
        Object obj2 = this.f28132z;
        switch (b) {
            case 0:
                q04 q04Var = new q04((C0795je) this.f28130x, (rd6) this.f28131y, (yj4) obj2, wm0Var);
                q04Var.f28129w = obj;
                return q04Var;
            default:
                q04 q04Var2 = new q04((td4) obj2, wm0Var);
                q04Var2.f28129w = obj;
                return q04Var2;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28127u;
        ju4 ju4Var = ju4.f22634a;
        uf4 uf4Var = (uf4) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((q04) create(wm0Var, uf4Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0306  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0247, code lost:
    
        if (r4 == r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r11 == r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0340, code lost:
    
        if (p000.C0006a5.m48C(r3, r2, r1, r6, r21) == r5) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0357, code lost:
    
        if (p000.C0006a5.m60P(r3, r9, r6, r21) == r5) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0363, code lost:
    
        if (p000.C0006a5.m61Q(r3, r9, r6, r1, r21) == r5) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        if (r7 == r1) goto L137;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0247 -> B:138:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d3 -> B:40:0x00d7). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uf4 uf4Var;
        Object objM68f;
        uf4 uf4Var2;
        Object objM5717a;
        ju4 ju4Var;
        boolean z;
        fc3 fc3Var;
        uf4 uf4Var3;
        lc3 lc3Var;
        Object objM11538a;
        ec3 ec3Var;
        uf4 uf4Var4;
        Object obj2;
        lc3 lc3Var2;
        uf4 uf4Var5;
        Object objM11538a2;
        Object obj3;
        byte b = this.f28127u;
        byte b2 = 2;
        ju4 ju4Var2 = ju4.f22634a;
        Object obj4 = this.f28132z;
        switch (b) {
            case 0:
                C0795je c0795je = (C0795je) this.f28130x;
                ap0 ap0Var = ap0.f14763a;
                byte b3 = this.f28128v;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    uf4Var = (uf4) this.f28129w;
                    this.f28129w = uf4Var;
                    this.f28128v = (byte) 1;
                    objM68f = C0006a5.m68f(uf4Var, this);
                    if (objM68f != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b3 == 1) {
                    uf4Var = (uf4) this.f28129w;
                    k43.m7376J(obj);
                    objM68f = obj;
                } else {
                    if (b3 != 2 && b3 != 3 && b3 != 4) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var2;
                ec3 ec3Var2 = (ec3) objM68f;
                fy4 fy4Var = (fy4) c0795je.f22194c;
                lc3 lc3Var3 = (lc3) c0795je.f22195d;
                lc3 lc3Var4 = (lc3) ec3Var2.f18000a.get(0);
                if (lc3Var3 == null || lc3Var4.f23936b - lc3Var3.f23936b >= fy4Var.mo5857b()) {
                    c0795je.f22193b = 1;
                } else if (b33.m3426d(b33.m3429g(lc3Var3.f23937c, lc3Var4.f23937c)) < q21.m9712g(fy4Var, lc3Var3.f23943i)) {
                    c0795je.f22193b++;
                } else {
                    c0795je.f22193b = 1;
                }
                c0795je.f22195d = lc3Var4;
                boolean zM12040a = w04.m12040a(ec3Var2);
                if (zM12040a && (ec3Var2.f18003d & 33) != 0) {
                    List list = ec3Var2.f18000a;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            rd6 rd6Var = (rd6) this.f28131y;
                            this.f28129w = null;
                            this.f28128v = (byte) 2;
                            break;
                        } else if (!((lc3) list.get(i)).m7954c()) {
                            i++;
                        }
                    }
                }
                if (!zM12040a && (r9 = (yj4) obj4) != null) {
                    int i2 = c0795je.f22193b;
                    if (i2 == 1) {
                        this.f28129w = null;
                        this.f28128v = (byte) 3;
                    } else {
                        this.f28129w = null;
                        this.f28128v = (byte) 4;
                    }
                    break;
                }
                return ju4Var2;
            default:
                td4 td4Var = (td4) obj4;
                ap0 ap0Var2 = ap0.f14763a;
                byte b4 = this.f28128v;
                if (b4 != 0) {
                    if (b4 == 1) {
                        uf4Var2 = (uf4) this.f28129w;
                        k43.m7376J(obj);
                        objM5717a = obj;
                    } else {
                        if (b4 == 2) {
                            fc3Var = (fc3) this.f28131y;
                            lc3Var = (lc3) this.f28130x;
                            uf4Var3 = (uf4) this.f28129w;
                            k43.m7376J(obj);
                            objM11538a = obj;
                            ju4Var = ju4Var2;
                            ec3 ec3Var3 = (ec3) objM11538a;
                            List list2 = ec3Var3.f18000a;
                            int size2 = list2.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    obj2 = list2.get(i3);
                                    lc3 lc3Var5 = (lc3) obj2;
                                    if (lc3Var5.m7954c()) {
                                        ec3Var = ec3Var3;
                                        uf4Var4 = uf4Var3;
                                    } else {
                                        uf4Var4 = uf4Var3;
                                        ec3Var = ec3Var3;
                                        if (!c20.m3818m(lc3Var5.f23935a, lc3Var.f23935a) || !lc3Var5.f23938d) {
                                        }
                                    }
                                    i3++;
                                    uf4Var3 = uf4Var4;
                                    ec3Var3 = ec3Var;
                                } else {
                                    ec3Var = ec3Var3;
                                    uf4Var4 = uf4Var3;
                                    obj2 = null;
                                }
                            }
                            lc3 lc3Var6 = (lc3) obj2;
                            if (lc3Var6 != null && lc3Var6.f23936b - lc3Var.f23936b < uf4Var4.m11540k().mo5858c() && ec3Var.f18002c != 2) {
                                if (b33.m3426d(b33.m3429g(lc3Var6.f23937c, lc3Var.f23937c)) <= uf4Var4.m11540k().mo5860e()) {
                                    uf4Var3 = uf4Var4;
                                    b2 = 2;
                                    this.f28129w = uf4Var3;
                                    this.f28130x = lc3Var;
                                    this.f28131y = fc3Var;
                                    this.f28128v = b2;
                                    objM11538a = uf4Var3.m11538a(fc3Var, this);
                                    break;
                                }
                                return ju4Var;
                            }
                            lc3Var6 = null;
                            if (lc3Var6 != null) {
                                if (!td4Var.f31092r) {
                                    mt2 mt2VarM10644P = td4Var.f25195a;
                                    uw2 uw2Var = null;
                                    while (true) {
                                        if (mt2VarM10644P == null) {
                                            if (!td4Var.f25195a.f25208n) {
                                                q32.m9721c("visitChildren called on an unattached node");
                                            }
                                            uw2 uw2Var2 = new uw2(new mt2[16]);
                                            mt2 mt2Var = td4Var.f25195a;
                                            mt2 mt2Var2 = mt2Var.f25200f;
                                            if (mt2Var2 == null) {
                                                sc6.m10663e(uw2Var2, mt2Var);
                                            } else {
                                                uw2Var2.m11663b(mt2Var2);
                                            }
                                            while (true) {
                                                int i4 = uw2Var2.f32213c;
                                                if (i4 != 0) {
                                                    mt2 mt2VarM10644P2 = (mt2) uw2Var2.m11672l(i4 - 1);
                                                    if ((mt2VarM10644P2.f25198d & 1024) == 0) {
                                                        sc6.m10663e(uw2Var2, mt2VarM10644P2);
                                                    } else {
                                                        while (true) {
                                                            if (mt2VarM10644P2 == null) {
                                                                continue;
                                                            } else if ((mt2VarM10644P2.f25197c & 1024) != 0) {
                                                                uw2 uw2Var3 = null;
                                                                while (true) {
                                                                    if (mt2VarM10644P2 == null) {
                                                                        continue;
                                                                    } else if (mt2VarM10644P2 instanceof sl1) {
                                                                        sl1.m10852X0((sl1) mt2VarM10644P2);
                                                                    } else {
                                                                        if ((mt2VarM10644P2.f25197c & 1024) != 0 && (mt2VarM10644P2 instanceof qx0)) {
                                                                            int i5 = 0;
                                                                            for (mt2 mt2Var3 = ((qx0) mt2VarM10644P2).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                                                                if ((mt2Var3.f25197c & 1024) != 0) {
                                                                                    i5++;
                                                                                    if (i5 == 1) {
                                                                                        mt2VarM10644P2 = mt2Var3;
                                                                                    } else {
                                                                                        if (uw2Var3 == null) {
                                                                                            uw2Var3 = new uw2(new mt2[16]);
                                                                                        }
                                                                                        if (mt2VarM10644P2 != null) {
                                                                                            uw2Var3.m11663b(mt2VarM10644P2);
                                                                                            mt2VarM10644P2 = null;
                                                                                        }
                                                                                        uw2Var3.m11663b(mt2Var3);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (i5 == 1) {
                                                                            }
                                                                        }
                                                                        mt2VarM10644P2 = sc6.m10644P(uw2Var3);
                                                                    }
                                                                }
                                                            } else {
                                                                mt2VarM10644P2 = mt2VarM10644P2.f25200f;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (mt2VarM10644P instanceof sl1) {
                                            sl1.m10852X0((sl1) mt2VarM10644P);
                                        } else {
                                            if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                                int i6 = 0;
                                                for (mt2 mt2Var4 = ((qx0) mt2VarM10644P).f28863p; mt2Var4 != null; mt2Var4 = mt2Var4.f25200f) {
                                                    if ((mt2Var4.f25197c & 1024) != 0) {
                                                        i6++;
                                                        if (i6 == 1) {
                                                            mt2VarM10644P = mt2Var4;
                                                        } else {
                                                            if (uw2Var == null) {
                                                                uw2Var = new uw2(new mt2[16]);
                                                            }
                                                            if (mt2VarM10644P != null) {
                                                                uw2Var.m11663b(mt2VarM10644P);
                                                                mt2VarM10644P = null;
                                                            }
                                                            uw2Var.m11663b(mt2Var4);
                                                        }
                                                    }
                                                }
                                                if (i6 == 1) {
                                                }
                                            }
                                            mt2VarM10644P = sc6.m10644P(uw2Var);
                                        }
                                    }
                                }
                                td4Var.f31091q.invoke();
                                lc3Var6.m7952a();
                                lc3Var2 = lc3Var;
                                uf4Var5 = uf4Var4;
                                fc3 fc3Var2 = fc3.f18903a;
                                this.f28129w = uf4Var5;
                                this.f28130x = lc3Var2;
                                this.f28131y = null;
                                this.f28128v = (byte) 3;
                                objM11538a2 = uf4Var5.m11538a(fc3Var2, this);
                                break;
                            }
                            return ju4Var;
                        }
                        if (b4 != 3) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lc3Var2 = (lc3) this.f28130x;
                        uf4Var5 = (uf4) this.f28129w;
                        k43.m7376J(obj);
                        objM11538a2 = obj;
                        ju4Var = ju4Var2;
                    }
                    List list3 = ((ec3) objM11538a2).f18000a;
                    int size3 = list3.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size3) {
                            obj3 = list3.get(i7);
                            lc3 lc3Var7 = (lc3) obj3;
                            if (lc3Var7.m7954c() || !c20.m3818m(lc3Var7.f23935a, lc3Var2.f23935a) || !lc3Var7.f23938d) {
                            }
                            i7++;
                        } else {
                            obj3 = null;
                        }
                    }
                    lc3 lc3Var8 = (lc3) obj3;
                    if (lc3Var8 != null) {
                        lc3Var8.m7952a();
                        fc3 fc3Var3 = fc3.f18903a;
                        this.f28129w = uf4Var5;
                        this.f28130x = lc3Var2;
                        this.f28131y = null;
                        this.f28128v = (byte) 3;
                        objM11538a2 = uf4Var5.m11538a(fc3Var3, this);
                        break;
                    }
                    return ju4Var;
                }
                k43.m7376J(obj);
                uf4Var2 = (uf4) this.f28129w;
                fc3 fc3Var4 = fc3.f18903a;
                this.f28129w = uf4Var2;
                this.f28128v = (byte) 1;
                objM5717a = fi4.m5717a(uf4Var2, true, fc3Var4, this);
                break;
                lc3 lc3Var9 = (lc3) objM5717a;
                int i8 = lc3Var9.f23943i;
                long j = lc3Var9.f23937c;
                if (i8 == 3 || i8 == 4) {
                    ju4Var = ju4Var2;
                    int i9 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i9) < 0.0f || Float.intBitsToFloat(i9) >= ((int) (uf4Var2.f31830f.f32578x >> 32))) {
                        z = false;
                    } else {
                        int i10 = (int) (j & 4294967295L);
                        if (Float.intBitsToFloat(i10) < 0.0f || Float.intBitsToFloat(i10) >= ((int) (4294967295L & uf4Var2.f31830f.f32578x))) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    fc3Var = (td4Var.f31092r || z) ? fc3.f18903a : fc3.f18904b;
                    uf4Var3 = uf4Var2;
                    lc3Var = lc3Var9;
                    this.f28129w = uf4Var3;
                    this.f28130x = lc3Var;
                    this.f28131y = fc3Var;
                    this.f28128v = b2;
                    objM11538a = uf4Var3.m11538a(fc3Var, this);
                    break;
                } else {
                    ju4Var = ju4Var2;
                }
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q04(td4 td4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f28132z = td4Var;
    }
}
