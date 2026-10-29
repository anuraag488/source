package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.Serializable;

/* JADX INFO: renamed from: fx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0667fx extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f19362A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Object f19363B;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f19364t;

    /* JADX INFO: renamed from: u */
    public byte f19365u;

    /* JADX INFO: renamed from: v */
    public Object f19366v;

    /* JADX INFO: renamed from: w */
    public Object f19367w;

    /* JADX INFO: renamed from: x */
    public Object f19368x;

    /* JADX INFO: renamed from: y */
    public Object f19369y;

    /* JADX INFO: renamed from: z */
    public Object f19370z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667fx(C0910mi c0910mi, yp1 yp1Var, lv1 lv1Var, C0910mi c0910mi2, yp1 yp1Var2, xs1 xs1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f19364t = (byte) 2;
        this.f19367w = c0910mi;
        this.f19368x = yp1Var;
        this.f19369y = lv1Var;
        this.f19370z = c0910mi2;
        this.f19362A = yp1Var2;
        this.f19363B = xs1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f19364t;
        Object obj2 = this.f19363B;
        Object obj3 = this.f19362A;
        switch (b) {
            case 0:
                return new C0667fx((b80) this.f19370z, (C0459am) obj3, (C1354y3) obj2, (sw2) this.f19368x, (sw2) this.f19369y, wm0Var);
            case 1:
                C0667fx c0667fx = new C0667fx(obj3, (Serializable) obj2, wm0Var, (byte) 1);
                c0667fx.f19370z = obj;
                return c0667fx;
            case 2:
                C0667fx c0667fx2 = new C0667fx((C0910mi) this.f19367w, (yp1) this.f19368x, (lv1) this.f19369y, (C0910mi) this.f19370z, (yp1) obj3, (xs1) obj2, wm0Var);
                c0667fx2.f19366v = obj;
                return c0667fx2;
            case 3:
                C0667fx c0667fx3 = new C0667fx((xw2) this.f19370z, (dx2) obj3, (yp1) obj2, wm0Var);
                c0667fx3.f19369y = obj;
                return c0667fx3;
            case 4:
                C0667fx c0667fx4 = new C0667fx((ContentResolver) this.f19368x, (Uri) this.f19369y, (n15) this.f19370z, (f40) obj3, (Context) obj2, wm0Var);
                c0667fx4.f19367w = obj;
                return c0667fx4;
            default:
                return new C0667fx(obj3, (Serializable) obj2, wm0Var, (byte) 5);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19364t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0667fx) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0667fx) create((wm0) obj2, obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0667fx) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C0667fx) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C0667fx) create((wm0) obj2, (ti1) obj)).invokeSuspend(ju4Var);
            default:
                return new C0667fx(this.f19362A, (Serializable) this.f19363B, (wm0) obj2, (byte) 5).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:235:0x0468 A[PHI: r0 r2 r3
  0x0468: PHI (r0v5 java.lang.Object) = (r0v2 java.lang.Object), (r0v3 java.lang.Object), (r0v4 java.lang.Object), (r0v10 java.lang.Object) binds: [B:234:0x0457, B:241:0x0494, B:243:0x04ce, B:231:0x0421] A[DONT_GENERATE, DONT_INLINE]
  0x0468: PHI (r2v7 java.util.Iterator) = (r2v5 java.util.Iterator), (r2v6 java.util.Iterator), (r2v6 java.util.Iterator), (r2v14 java.util.Iterator) binds: [B:234:0x0457, B:241:0x0494, B:243:0x04ce, B:231:0x0421] A[DONT_GENERATE, DONT_INLINE]
  0x0468: PHI (r3v17 java.util.List) = (r3v15 java.util.List), (r3v16 java.util.List), (r3v16 java.util.List), (r3v22 java.util.List) binds: [B:234:0x0457, B:241:0x0494, B:243:0x04ce, B:231:0x0421] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:237:0x046e  */
    /* JADX WARN: Code duplicated, block: B:240:0x048e A[PHI: r0 r2 r3 r6 r7
  0x048e: PHI (r0v3 java.lang.Object) = (r0v5 java.lang.Object), (r0v6 java.lang.Object) binds: [B:238:0x048b, B:233:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x048e: PHI (r2v6 java.util.Iterator) = (r2v7 java.util.Iterator), (r2v10 java.util.Iterator) binds: [B:238:0x048b, B:233:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x048e: PHI (r3v16 java.util.List) = (r3v17 java.util.List), (r3v21 java.util.List) binds: [B:238:0x048b, B:233:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x048e: PHI (r6v11 e54) = (r6v15 e54), (r6v19 e54) binds: [B:238:0x048b, B:233:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x048e: PHI (r7v2 java.lang.Object) = (r7v15 java.lang.Object), (r7v17 java.lang.Object) binds: [B:238:0x048b, B:233:0x043b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x0496  */
    /* JADX WARN: Code duplicated, block: B:262:0x0524 A[PHI: r1 r3
  0x0524: PHI (r1v9 z30) = (r1v11 z30), (r1v14 z30) binds: [B:260:0x0521, B:257:0x0504] A[DONT_GENERATE, DONT_INLINE]
  0x0524: PHI (r3v2 java.lang.Object) = (r3v8 java.lang.Object), (r3v10 java.lang.Object) binds: [B:260:0x0521, B:257:0x0504] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:264:0x052c  */
    /* JADX WARN: Code duplicated, block: B:267:0x0555  */
    /* JADX WARN: Code duplicated, block: B:272:0x057e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v46, types: [gx2] */
    /* JADX WARN: Type inference failed for: r1v57, types: [gx2] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r2v21, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [gx2] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [gx2] */
    /* JADX WARN: Type inference failed for: r2v38, types: [gx2] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45, types: [cp0, java.lang.Object, java.lang.Throwable, ro0, wm0] */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57, types: [cp0, java.lang.Object, java.lang.Throwable, ro0, wm0] */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x02a6 -> B:155:0x026e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:241:0x0494 -> B:235:0x0468). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:243:0x04ce -> B:235:0x0468). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:269:0x0578 -> B:271:0x057c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0667fx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667fx(b80 b80Var, C0459am c0459am, C1354y3 c1354y3, sw2 sw2Var, sw2 sw2Var2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f19364t = (byte) 0;
        this.f19370z = b80Var;
        this.f19362A = c0459am;
        this.f19363B = c1354y3;
        this.f19368x = sw2Var;
        this.f19369y = sw2Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667fx(xw2 xw2Var, dx2 dx2Var, yp1 yp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f19364t = (byte) 3;
        this.f19370z = xw2Var;
        this.f19362A = dx2Var;
        this.f19363B = yp1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667fx(ContentResolver contentResolver, Uri uri, n15 n15Var, f40 f40Var, Context context, wm0 wm0Var) {
        super(2, wm0Var);
        this.f19364t = (byte) 4;
        this.f19368x = contentResolver;
        this.f19369y = uri;
        this.f19370z = n15Var;
        this.f19362A = f40Var;
        this.f19363B = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0667fx(Object obj, Serializable serializable, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f19364t = b;
        this.f19362A = obj;
        this.f19363B = serializable;
    }
}
