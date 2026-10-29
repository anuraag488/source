package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qa4 {

    /* JADX INFO: renamed from: a */
    public static final long f28345a = vd6.m11817A(14);

    /* JADX INFO: renamed from: b */
    public static final long f28346b = vd6.m11817A(0);

    /* JADX INFO: renamed from: c */
    public static final long f28347c = pb0.f27500g;

    /* JADX INFO: renamed from: d */
    public static final yk4 f28348d;

    static {
        yk4 yk4Var;
        long j = pb0.f27495b;
        if (j != 16) {
            fd0 fd0Var = new fd0();
            fd0Var.f18920a = j;
            if (j == 16) {
                r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
            }
            VarHandle.storeStoreFence();
            yk4Var = fd0Var;
        } else {
            yk4Var = ig1.f21365D;
        }
        f28348d = yk4Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:108:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0191  */
    /* JADX WARN: Code duplicated, block: B:111:0x0195  */
    /* JADX WARN: Code duplicated, block: B:112:0x0197  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b A[PHI: r19
  0x004b: PHI (r19v6 ig1) = 
  (r19v0 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
  (r19v7 ig1)
 binds: [B:6:0x0034, B:35:0x0092, B:44:0x00b2, B:41:0x00a8, B:38:0x009e, B:33:0x0086, B:30:0x007c, B:25:0x006d, B:22:0x0067, B:19:0x005d, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x01df  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d A[PHI: r15 r19
  0x004d: PHI (r15v6 ay) = (r15v7 ay), (r15v9 ay), (r15v9 ay), (r15v10 ay) binds: [B:13:0x004b, B:57:0x00dc, B:52:0x00cd, B:47:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r19v5 ig1) = (r19v6 ig1), (r19v7 ig1), (r19v7 ig1), (r19v7 ig1) binds: [B:13:0x004b, B:57:0x00dc, B:52:0x00cd, B:47:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f A[PHI: r4 r15 r19
  0x004f: PHI (r4v5 long) = (r4v6 long), (r4v9 long) binds: [B:14:0x004d, B:63:0x00f0] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r15v5 ay) = (r15v6 ay), (r15v9 ay) binds: [B:14:0x004d, B:63:0x00f0] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r19v4 ig1) = (r19v5 ig1), (r19v7 ig1) binds: [B:14:0x004d, B:63:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x0110  */
    /* JADX WARN: Code duplicated, block: B:78:0x0114  */
    /* JADX WARN: Code duplicated, block: B:80:0x0123  */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x013f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x014d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0151  */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    /* JADX INFO: renamed from: a */
    public static final pa4 m9810a(pa4 pa4Var, long j, t30 t30Var, float f, long j2, xm1 xm1Var, tm1 tm1Var, um1 um1Var, bm1 bm1Var, String str, long j3, C0471ay c0471ay, zk4 zk4Var, zm2 zm2Var, long j4, uj4 uj4Var, m44 m44Var, qq2 qq2Var) {
        ig1 ig1Var;
        C0471ay c0471ay2;
        qq2 qq2Var2;
        m44 m44Var2;
        long j5;
        yk4 v30Var;
        yk4 yk4Var;
        boolean z;
        boolean zEquals;
        yk4 v30Var2;
        long j6;
        xm1 xm1Var2;
        zk4 zk4Var2;
        zm2 zm2Var2;
        uj4 uj4Var2;
        qq2 qq2Var3;
        long jM6602A;
        long j7;
        tm1 tm1Var2 = tm1Var;
        um1 um1Var2 = um1Var;
        bm1 bm1Var2 = bm1Var;
        String str2 = str;
        long j8 = j3;
        ig1 ig1Var2 = ig1.f21365D;
        cm4[] cm4VarArr = bm4.f15418b;
        long j9 = j2 & 1095216660480L;
        if (j9 != 0) {
            ig1Var = ig1Var2;
            if (!bm4.m3632b(j2, pa4Var.f27479b)) {
                c0471ay2 = c0471ay;
                j5 = j4;
                m44Var2 = m44Var;
                qq2Var2 = qq2Var;
            }
            if (t30Var != null) {
                if (t30Var instanceof ga4) {
                    jM6602A = i25.m6602A(((ga4) t30Var).f19691a, f);
                    if (jM6602A != 16) {
                        fd0 fd0Var = new fd0();
                        fd0Var.f18920a = jM6602A;
                        if (jM6602A == 16) {
                            r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                        }
                        VarHandle.storeStoreFence();
                        v30Var = fd0Var;
                    } else {
                        v30Var = ig1Var;
                    }
                } else {
                    if (t30Var instanceof u30) {
                        C0670g.m5864c();
                        return null;
                    }
                    v30Var = new v30((u30) t30Var, f);
                }
            } else if (j != 16) {
                fd0 fd0Var2 = new fd0();
                fd0Var2.f18920a = j;
                if (j == 16) {
                    r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                }
                VarHandle.storeStoreFence();
                v30Var = fd0Var2;
            } else {
                v30Var = ig1Var;
            }
            yk4Var = pa4Var.f27478a;
            yk4Var.getClass();
            z = v30Var instanceof v30;
            if (!z && (yk4Var instanceof v30)) {
                v30 v30Var3 = (v30) v30Var;
                u30 u30Var = v30Var3.f32356a;
                float f2 = v30Var3.f32357b;
                if (Float.isNaN(f2)) {
                    f2 = ((v30) yk4Var).f32357b;
                }
                v30Var2 = new v30(u30Var, f2);
            } else if (z || (yk4Var instanceof v30)) {
                if (z && (yk4Var instanceof v30)) {
                    v30Var2 = yk4Var;
                } else {
                    zEquals = v30Var.equals(ig1Var);
                    v30Var2 = v30Var;
                    if (zEquals) {
                        v30Var2 = yk4Var;
                    }
                }
            }
            if (bm1Var2 == null) {
                bm1Var2 = pa4Var.f27483f;
            }
            if (j9 == 0) {
                j6 = pa4Var.f27479b;
            } else {
                j6 = j2;
            }
            if (xm1Var == null) {
                xm1Var2 = pa4Var.f27480c;
            } else {
                xm1Var2 = xm1Var;
            }
            if (tm1Var2 == null) {
                tm1Var2 = pa4Var.f27481d;
            }
            if (um1Var2 == null) {
                um1Var2 = pa4Var.f27482e;
            }
            if (str2 == null) {
                str2 = pa4Var.f27484g;
            }
            if ((j8 & 1095216660480L) == 0) {
                j8 = pa4Var.f27485h;
            }
            if (c0471ay2 == null) {
                c0471ay2 = pa4Var.f27486i;
            }
            long j10 = j6;
            if (zk4Var == null) {
                zk4Var2 = pa4Var.f27487j;
            } else {
                zk4Var2 = zk4Var;
            }
            if (zm2Var == null) {
                zm2Var2 = pa4Var.f27488k;
            } else {
                zm2Var2 = zm2Var;
            }
            if (j5 == 16) {
                j5 = pa4Var.f27489l;
            }
            zk4 zk4Var3 = zk4Var2;
            if (uj4Var == null) {
                uj4Var2 = pa4Var.f27490m;
            } else {
                uj4Var2 = uj4Var;
            }
            if (m44Var2 == null) {
                m44Var2 = pa4Var.f27491n;
            }
            if (qq2Var2 == null) {
                qq2Var3 = pa4Var.f27492o;
            } else {
                qq2Var3 = qq2Var2;
            }
            return new pa4(v30Var2, j10, xm1Var2, tm1Var2, um1Var2, bm1Var2, str2, j8, c0471ay2, zk4Var3, zm2Var2, j5, uj4Var2, m44Var2, qq2Var3);
        }
        ig1Var = ig1Var2;
        if (t30Var != null || j == 16) {
            if ((tm1Var2 != null || tm1Var2.equals(pa4Var.f27481d)) && ((xm1Var == null || xm1Var.equals(pa4Var.f27480c)) && ((bm1Var2 == null || bm1Var2 == pa4Var.f27483f) && (((j8 & 1095216660480L) == 0 || bm4.m3632b(j8, pa4Var.f27485h)) && ((uj4Var == null || uj4Var.equals(pa4Var.f27490m)) && z62.m13387o(t30Var, pa4Var.f27478a.mo5690f()) && ((t30Var == null || f == pa4Var.f27478a.mo5691h()) && ((um1Var2 == null || um1Var2.equals(pa4Var.f27482e)) && (str2 == null || str2.equals(pa4Var.f27484g))))))))) {
                if (c0471ay != null) {
                    c0471ay2 = c0471ay;
                    if (c0471ay2.equals(pa4Var.f27486i)) {
                    }
                } else {
                    c0471ay2 = c0471ay;
                }
                if (zk4Var != null || zk4Var.equals(pa4Var.f27487j)) {
                    if (zm2Var != null || zm2Var.equals(pa4Var.f27488k)) {
                        j5 = j4;
                        if (j5 != 16) {
                            j7 = pa4Var.f27489l;
                            int i = pb0.f27502i;
                            if (ws4.m12408a(j5, j7)) {
                            }
                            qq2Var2 = qq2Var;
                        }
                        m44Var2 = m44Var;
                        if (m44Var2 != null || m44Var2.equals(pa4Var.f27491n)) {
                            qq2Var2 = qq2Var;
                            if (qq2Var2 != null || qq2Var2.equals(pa4Var.f27492o)) {
                                return pa4Var;
                            }
                        } else {
                            qq2Var2 = qq2Var;
                        }
                    }
                    m44Var2 = m44Var;
                    qq2Var2 = qq2Var;
                }
            } else {
                c0471ay2 = c0471ay;
            }
            j5 = j4;
            m44Var2 = m44Var;
            qq2Var2 = qq2Var;
        } else {
            long jMo5689a = pa4Var.f27478a.mo5689a();
            int i2 = pb0.f27502i;
            if (ws4.m12408a(j, jMo5689a)) {
                if (tm1Var2 != null) {
                    if (c0471ay != null) {
                        c0471ay2 = c0471ay;
                        if (c0471ay2.equals(pa4Var.f27486i)) {
                            j5 = j4;
                            m44Var2 = m44Var;
                            qq2Var2 = qq2Var;
                        }
                    } else {
                        c0471ay2 = c0471ay;
                    }
                    if (zk4Var != null) {
                    }
                    if (zm2Var != null) {
                    }
                    j5 = j4;
                    if (j5 != 16) {
                        j7 = pa4Var.f27489l;
                        int i3 = pb0.f27502i;
                        if (ws4.m12408a(j5, j7)) {
                            m44Var2 = m44Var;
                        }
                        qq2Var2 = qq2Var;
                    }
                    m44Var2 = m44Var;
                    if (m44Var2 != null) {
                    }
                    qq2Var2 = qq2Var;
                    if (qq2Var2 != null) {
                    }
                    return pa4Var;
                }
                if (c0471ay != null) {
                    c0471ay2 = c0471ay;
                    if (c0471ay2.equals(pa4Var.f27486i)) {
                        j5 = j4;
                        m44Var2 = m44Var;
                        qq2Var2 = qq2Var;
                    }
                } else {
                    c0471ay2 = c0471ay;
                }
                if (zk4Var != null) {
                }
                if (zm2Var != null) {
                }
                j5 = j4;
                if (j5 != 16) {
                    j7 = pa4Var.f27489l;
                    int i4 = pb0.f27502i;
                    if (ws4.m12408a(j5, j7)) {
                        m44Var2 = m44Var;
                    }
                    qq2Var2 = qq2Var;
                }
                m44Var2 = m44Var;
                if (m44Var2 != null) {
                }
                qq2Var2 = qq2Var;
                if (qq2Var2 != null) {
                }
                return pa4Var;
            }
            c0471ay2 = c0471ay;
            j5 = j4;
            m44Var2 = m44Var;
            qq2Var2 = qq2Var;
        }
        if (t30Var != null) {
            if (t30Var instanceof ga4) {
                jM6602A = i25.m6602A(((ga4) t30Var).f19691a, f);
                if (jM6602A != 16) {
                    fd0 fd0Var3 = new fd0();
                    fd0Var3.f18920a = jM6602A;
                    if (jM6602A == 16) {
                        r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                    }
                    VarHandle.storeStoreFence();
                    v30Var = fd0Var3;
                } else {
                    v30Var = ig1Var;
                }
            } else {
                if (t30Var instanceof u30) {
                    C0670g.m5864c();
                    return null;
                }
                v30Var = new v30((u30) t30Var, f);
            }
        } else if (j != 16) {
            fd0 fd0Var4 = new fd0();
            fd0Var4.f18920a = j;
            if (j == 16) {
                r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
            }
            VarHandle.storeStoreFence();
            v30Var = fd0Var4;
        } else {
            v30Var = ig1Var;
        }
        yk4Var = pa4Var.f27478a;
        yk4Var.getClass();
        z = v30Var instanceof v30;
        if (!z) {
            if (z) {
                if (z) {
                    zEquals = v30Var.equals(ig1Var);
                    v30Var2 = v30Var;
                    if (zEquals) {
                        v30Var2 = yk4Var;
                    }
                } else {
                    zEquals = v30Var.equals(ig1Var);
                    v30Var2 = v30Var;
                    if (zEquals) {
                        v30Var2 = yk4Var;
                    }
                }
            } else if (z) {
                zEquals = v30Var.equals(ig1Var);
                v30Var2 = v30Var;
                if (zEquals) {
                    v30Var2 = yk4Var;
                }
            } else {
                zEquals = v30Var.equals(ig1Var);
                v30Var2 = v30Var;
                if (zEquals) {
                    v30Var2 = yk4Var;
                }
            }
        } else if (z) {
            if (z) {
                zEquals = v30Var.equals(ig1Var);
                v30Var2 = v30Var;
                if (zEquals) {
                    v30Var2 = yk4Var;
                }
            } else {
                zEquals = v30Var.equals(ig1Var);
                v30Var2 = v30Var;
                if (zEquals) {
                    v30Var2 = yk4Var;
                }
            }
        } else if (z) {
            zEquals = v30Var.equals(ig1Var);
            v30Var2 = v30Var;
            if (zEquals) {
                v30Var2 = yk4Var;
            }
        } else {
            zEquals = v30Var.equals(ig1Var);
            v30Var2 = v30Var;
            if (zEquals) {
                v30Var2 = yk4Var;
            }
        }
        if (bm1Var2 == null) {
            bm1Var2 = pa4Var.f27483f;
        }
        if (j9 == 0) {
            j6 = pa4Var.f27479b;
        } else {
            j6 = j2;
        }
        if (xm1Var == null) {
            xm1Var2 = pa4Var.f27480c;
        } else {
            xm1Var2 = xm1Var;
        }
        if (tm1Var2 == null) {
            tm1Var2 = pa4Var.f27481d;
        }
        if (um1Var2 == null) {
            um1Var2 = pa4Var.f27482e;
        }
        if (str2 == null) {
            str2 = pa4Var.f27484g;
        }
        if ((j8 & 1095216660480L) == 0) {
            j8 = pa4Var.f27485h;
        }
        if (c0471ay2 == null) {
            c0471ay2 = pa4Var.f27486i;
        }
        long j11 = j6;
        if (zk4Var == null) {
            zk4Var2 = pa4Var.f27487j;
        } else {
            zk4Var2 = zk4Var;
        }
        if (zm2Var == null) {
            zm2Var2 = pa4Var.f27488k;
        } else {
            zm2Var2 = zm2Var;
        }
        if (j5 == 16) {
            j5 = pa4Var.f27489l;
        }
        zk4 zk4Var4 = zk4Var2;
        if (uj4Var == null) {
            uj4Var2 = pa4Var.f27490m;
        } else {
            uj4Var2 = uj4Var;
        }
        if (m44Var2 == null) {
            m44Var2 = pa4Var.f27491n;
        }
        if (qq2Var2 == null) {
            qq2Var3 = pa4Var.f27492o;
        } else {
            qq2Var3 = qq2Var2;
        }
        return new pa4(v30Var2, j11, xm1Var2, tm1Var2, um1Var2, bm1Var2, str2, j8, c0471ay2, zk4Var4, zm2Var2, j5, uj4Var2, m44Var2, qq2Var3);
    }
}
