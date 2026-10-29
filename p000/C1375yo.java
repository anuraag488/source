package p000;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1375yo implements xb4 {

    /* JADX INFO: renamed from: a */
    public List f35374a;

    /* JADX INFO: renamed from: b */
    public fs4 f35375b;

    /* JADX INFO: renamed from: c */
    public jp0 f35376c;

    /* JADX INFO: renamed from: d */
    public yp1 f35377d;

    /* JADX INFO: renamed from: e */
    public C0572de f35378e;

    /* JADX INFO: renamed from: f */
    public d83 f35379f;

    /* JADX INFO: renamed from: g */
    public boolean f35380g;

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0070, B:32:0x0096, B:36:0x00bd, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0070, B:32:0x0096, B:36:0x00bd, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0070, B:32:0x0096, B:36:0x00bd, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0070, B:32:0x0096, B:36:0x00bd, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[PHI: r0 r6 r9 r12
  0x00d3: PHI (r0v15 java.util.List) = (r0v11 java.util.List), (r0v16 java.util.List) binds: [B:26:0x006e, B:39:0x00d2] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:26:0x006e, B:39:0x00d2] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r9v7 byte) = (r9v3 byte), (r9v8 byte) binds: [B:26:0x006e, B:39:0x00d2] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:26:0x006e, B:39:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006e -> B:40:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00cf -> B:39:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m13186a(p000.ym0 r18) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1375yo.m13186a(ym0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m13187b(vt1 vt1Var, ym0 ym0Var) {
        C1338xo c1338xo;
        if (ym0Var instanceof C1338xo) {
            c1338xo = (C1338xo) ym0Var;
            int i = c1338xo.f34477w;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1338xo.f34477w = i - Integer.MIN_VALUE;
            } else {
                c1338xo = new C1338xo(this, ym0Var);
            }
        } else {
            c1338xo = new C1338xo(this, ym0Var);
        }
        Object obj = c1338xo.f34475u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c1338xo.f34477w;
        wm0 wm0Var = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vt1 vt1Var2 = c1338xo.f34474t;
                k43.m7376J(obj);
                return obj;
            }
            k43.m7376J(obj);
            C0594e0 c0594e0 = new C0594e0((Object) this, (Object) vt1Var, wm0Var, (byte) 5);
            c1338xo.f34474t = vt1Var;
            c1338xo.f34477w = 1;
            Object objM10727i0 = se0.m10727i0(15000L, c0594e0, c1338xo);
            return objM10727i0 == ap0Var ? ap0Var : objM10727i0;
        } catch (CancellationException e) {
            if (!y70.m13006G(c1338xo.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            to0 to0Var = (to0) c1338xo.getContext().get(wv1.f33762e);
            if (to0Var != null) {
                to0Var.handleException(c1338xo.getContext(), new IllegalStateException("Unable to load font " + vt1Var, e2));
            }
            return null;
        }
    }

    @Override // p000.xb4
    public final Object getValue() {
        return this.f35379f.getValue();
    }
}
