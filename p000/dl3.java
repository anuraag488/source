package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dl3 extends of4 implements nq1 {

    /* JADX INFO: renamed from: A */
    public mw2 f17147A;

    /* JADX INFO: renamed from: B */
    public byte f17148B;

    /* JADX INFO: renamed from: C */
    public /* synthetic */ vt2 f17149C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ el3 f17150D;

    /* JADX INFO: renamed from: t */
    public List f17151t;

    /* JADX INFO: renamed from: u */
    public List f17152u;

    /* JADX INFO: renamed from: v */
    public List f17153v;

    /* JADX INFO: renamed from: w */
    public mw2 f17154w;

    /* JADX INFO: renamed from: x */
    public mw2 f17155x;

    /* JADX INFO: renamed from: y */
    public mw2 f17156y;

    /* JADX INFO: renamed from: z */
    public Set f17157z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl3(el3 el3Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f17150D = el3Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[Catch: all -> 0x002c, LOOP:1: B:12:0x0042->B:22:0x0078, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[Catch: all -> 0x002c, LOOP:3: B:27:0x0090->B:37:0x00bd, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100 A[Catch: all -> 0x002c, LOOP:5: B:41:0x00d0->B:51:0x0100, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0083 A[EDGE_INSN: B:61:0x0083->B:24:0x0083 BREAK  A[LOOP:1: B:12:0x0042->B:22:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0 A[EDGE_INSN: B:66:0x00c0->B:38:0x00c0 BREAK  A[LOOP:3: B:27:0x0090->B:37:0x00bd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[EDGE_INSN: B:71:0x0103->B:52:0x0103 BREAK  A[LOOP:5: B:41:0x00d0->B:51:0x0100], SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m4543i(el3 el3Var, List list, List list2, List list3, mw2 mw2Var, mw2 mw2Var2, mw2 mw2Var3, mw2 mw2Var4) {
        char c;
        long j;
        long j2;
        synchronized (el3Var.f18216c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    zi0 zi0Var = (zi0) list3.get(i);
                    zi0Var.m13574b();
                    el3Var.m5177P(zi0Var);
                }
                list3.clear();
                Object[] objArr = mw2Var.f25258b;
                long[] jArr = mw2Var.f25257a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    zi0 zi0Var2 = (zi0) objArr[(i2 << 3) + i4];
                                    zi0Var2.m13574b();
                                    el3Var.m5177P(zi0Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                mw2Var.m8410b();
                Object[] objArr2 = mw2Var2.f25258b;
                long[] jArr2 = mw2Var2.f25257a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) == j2) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((zi0) objArr2[(i5 << 3) + i7]).m13580j();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                mw2Var2.m8410b();
                mw2Var3.m8410b();
                Object[] objArr3 = mw2Var4.f25258b;
                long[] jArr3 = mw2Var4.f25257a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) == j2) {
                            if (i8 != length3) {
                                break;
                                break;
                            }
                            i8++;
                        } else {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    zi0 zi0Var3 = (zi0) objArr3[(i8 << 3) + i10];
                                    zi0Var3.m13574b();
                                    el3Var.m5177P(zi0Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 != length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                mw2Var4.m8410b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m4544k(List list, el3 el3Var) {
        list.clear();
        synchronized (el3Var.f18216c) {
            try {
                ArrayList arrayList = el3Var.f18224k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((uu2) arrayList.get(i));
                }
                el3Var.f18224k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dl3 dl3Var = new dl3(this.f17150D, (wm0) obj3);
        dl3Var.f17149C = (vt2) obj2;
        dl3Var.invokeSuspend(ju4.f22634a);
        return ap0.f14763a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x00b0 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f0 A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {, blocks: (B:18:0x00e8, B:21:0x00f0), top: B:103:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:29:0x0104  */
    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    /* JADX WARN: Code duplicated, block: B:36:0x010f A[PHI: r1 r2 r4 r5 r6 r7 r8 r9 r10 r11 r12 r13
  0x010f: PHI (r1v2 ap0) = (r1v3 ap0), (r1v0 ap0) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r2v2 vt2) = (r2v3 vt2), (r2v20 vt2) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r4v1 byte) = (r4v2 byte), (r4v0 byte) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r5v1 byte) = (r5v2 byte), (r5v0 byte) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r6v1 java.util.List) = (r6v2 java.util.List), (r6v16 java.util.List) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r7v1 java.util.List) = (r7v2 java.util.List), (r7v21 java.util.List) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r8v1 java.util.List) = (r8v2 java.util.List), (r8v14 java.util.List) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r9v2 mw2) = (r9v3 mw2), (r9v6 mw2) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r10v1 mw2) = (r10v2 mw2), (r10v7 mw2) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r11v1 mw2) = (r11v2 mw2), (r11v7 mw2) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r12v1 java.util.Set) = (r12v2 java.util.Set), (r12v7 java.util.Set) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r13v1 mw2) = (r13v2 mw2), (r13v6 mw2) binds: [B:34:0x010c, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x02bc A[PHI: r1 r2 r4 r5 r6 r7 r8 r9 r10 r11 r12 r13
  0x02bc: PHI (r1v4 ap0) = (r1v2 ap0), (r1v13 ap0) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r2v4 vt2) = (r2v2 vt2), (r2v10 vt2) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r4v3 byte) = (r4v1 byte), (r4v5 byte) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r5v3 byte) = (r5v1 byte), (r5v4 byte) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r6v3 java.util.List) = (r6v1 java.util.List), (r6v5 java.util.List) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r7v3 java.util.List) = (r7v1 java.util.List), (r7v5 java.util.List) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r8v3 java.util.List) = (r8v1 java.util.List), (r8v5 java.util.List) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r9v4 mw2) = (r9v2 mw2), (r9v5 mw2) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r10v3 mw2) = (r10v1 mw2), (r10v4 mw2) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r11v3 mw2) = (r11v1 mw2), (r11v4 mw2) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r12v3 java.util.Set) = (r12v1 java.util.Set), (r12v4 java.util.Set) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r13v3 mw2) = (r13v1 mw2), (r13v4 mw2) binds: [B:37:0x0117, B:97:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0117 -> B:98:0x02bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0159 -> B:41:0x015c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dl3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
