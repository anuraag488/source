package p000;

import ads_mobile_sdk.f71;
import ads_mobile_sdk.pe2;
import ads_mobile_sdk.y24;
import android.content.Context;

/* JADX INFO: renamed from: sw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1160sw extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f30598t;

    /* JADX INFO: renamed from: u */
    public byte f30599u;

    /* JADX INFO: renamed from: v */
    public Object f30600v;

    /* JADX INFO: renamed from: w */
    public Object f30601w;

    /* JADX INFO: renamed from: x */
    public Object f30602x;

    /* JADX INFO: renamed from: y */
    public Object f30603y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f30604z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160sw(Context context, yp1 yp1Var, C0950nl c0950nl, mq1 mq1Var, C1409zl c1409zl, wm0 wm0Var) {
        super(2, wm0Var);
        this.f30598t = (byte) 0;
        this.f30600v = context;
        this.f30601w = yp1Var;
        this.f30602x = c0950nl;
        this.f30603y = mq1Var;
        this.f30604z = c1409zl;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f30598t;
        Object obj2 = this.f30604z;
        switch (b) {
            case 0:
                return new C1160sw((Context) this.f30600v, (yp1) this.f30601w, (C0950nl) this.f30602x, (mq1) this.f30603y, (C1409zl) obj2, wm0Var);
            case 1:
                C1160sw c1160sw = new C1160sw((og3) this.f30602x, (d00) this.f30603y, (xn2) obj2, wm0Var, (byte) 1);
                c1160sw.f30601w = obj;
                return c1160sw;
            case 2:
                return new C1160sw((yz3) this.f30602x, this.f30603y, (dp4) obj2, wm0Var, (byte) 2);
            case 3:
                C1160sw c1160sw2 = new C1160sw((wp1) obj2, wm0Var);
                c1160sw2.f30603y = obj;
                return c1160sw2;
            case 4:
                return new C1160sw((f71) obj2, (mq1) this.f30603y, wm0Var);
            case 5:
                return new C1160sw((pe2) this.f30602x, (mq1) obj2, wm0Var);
            default:
                return new C1160sw((y24) this.f30603y, (String) obj2, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f30598t;
        Object obj3 = this.f30604z;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1160sw) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C1160sw) create((wm0) obj2, (C0927mz) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C1160sw) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                ((C1160sw) create((wm0) obj2, (ti1) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 4:
                return new C1160sw((f71) obj3, (mq1) this.f30603y, (wm0) obj2).invokeSuspend(ju4Var);
            case 5:
                return new C1160sw((pe2) this.f30602x, (mq1) obj3, (wm0) obj2).invokeSuspend(ju4Var);
            default:
                return new C1160sw((y24) this.f30603y, (String) obj3, (wm0) obj2).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0229  */
    /* JADX WARN: Code duplicated, block: B:103:0x022a A[Catch: all -> 0x018d, PHI: r2 r3 r5 r7
  0x022a: PHI (r2v23 java.lang.Object) = (r2v22 java.lang.Object), (r2v27 java.lang.Object) binds: [B:101:0x0227, B:89:0x01a5] A[DONT_GENERATE, DONT_INLINE]
  0x022a: PHI (r3v21 ??) = (r3v48 ??), (r3v49 ??) binds: [B:101:0x0227, B:89:0x01a5] A[DONT_GENERATE, DONT_INLINE]
  0x022a: PHI (r5v43 ??) = (r5v67 ??), (r5v68 ??) binds: [B:101:0x0227, B:89:0x01a5] A[DONT_GENERATE, DONT_INLINE]
  0x022a: PHI (r7v39 ti1) = (r7v38 ti1), (r7v43 ti1) binds: [B:101:0x0227, B:89:0x01a5] A[DONT_GENERATE, DONT_INLINE], TryCatch #9 {all -> 0x018d, blocks: (B:89:0x01a5, B:103:0x022a, B:100:0x0219, B:105:0x0238, B:83:0x0188), top: B:359:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0238 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #9 {all -> 0x018d, blocks: (B:89:0x01a5, B:103:0x022a, B:100:0x0219, B:105:0x0238, B:83:0x0188), top: B:359:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x024a  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x0320  */
    /* JADX WARN: Code duplicated, block: B:163:0x0342  */
    /* JADX WARN: Code duplicated, block: B:165:0x034c  */
    /* JADX WARN: Code duplicated, block: B:170:0x035a  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:200:0x0400 A[PHI: r3 r8 r9 r19
  0x0400: PHI (r3v14 yz3) = (r3v7 yz3), (r3v15 yz3) binds: [B:198:0x03fd, B:134:0x02a2] A[DONT_GENERATE, DONT_INLINE]
  0x0400: PHI (r8v18 java.lang.Object) = (r8v10 java.lang.Object), (r8v20 java.lang.Object) binds: [B:198:0x03fd, B:134:0x02a2] A[DONT_GENERATE, DONT_INLINE]
  0x0400: PHI (r9v40 ap0) = (r9v29 ap0), (r9v41 ap0) binds: [B:198:0x03fd, B:134:0x02a2] A[DONT_GENERATE, DONT_INLINE]
  0x0400: PHI (r19v7 float) = (r19v2 float), (r19v8 float) binds: [B:198:0x03fd, B:134:0x02a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:244:0x0510  */
    /* JADX WARN: Code duplicated, block: B:250:0x0539  */
    /* JADX WARN: Code duplicated, block: B:252:0x054b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0558  */
    /* JADX WARN: Code duplicated, block: B:331:0x0799 A[Catch: all -> 0x058a, TryCatch #5 {all -> 0x058a, blocks: (B:263:0x0583, B:329:0x0795, B:331:0x0799, B:333:0x079f, B:334:0x07a2, B:335:0x07a6, B:268:0x0595, B:274:0x05b8, B:314:0x06e8, B:315:0x0735, B:317:0x073b, B:318:0x0749, B:320:0x075a, B:322:0x0769, B:323:0x076d, B:325:0x0774, B:326:0x0781, B:340:0x07ba, B:341:0x07bd, B:271:0x059e, B:275:0x0606, B:276:0x0613, B:278:0x0619, B:279:0x0636, B:281:0x063f, B:286:0x064e, B:288:0x065a, B:290:0x066a, B:291:0x066e, B:293:0x067a, B:295:0x068b, B:297:0x0691, B:299:0x069d, B:301:0x06ac, B:302:0x06b0, B:304:0x06b7, B:306:0x06d9, B:312:0x06e4, B:313:0x06e7, B:338:0x07b8), top: B:352:0x057d, inners: #7, #13 }] */
    /* JADX WARN: Code duplicated, block: B:333:0x079f A[Catch: all -> 0x058a, TryCatch #5 {all -> 0x058a, blocks: (B:263:0x0583, B:329:0x0795, B:331:0x0799, B:333:0x079f, B:334:0x07a2, B:335:0x07a6, B:268:0x0595, B:274:0x05b8, B:314:0x06e8, B:315:0x0735, B:317:0x073b, B:318:0x0749, B:320:0x075a, B:322:0x0769, B:323:0x076d, B:325:0x0774, B:326:0x0781, B:340:0x07ba, B:341:0x07bd, B:271:0x059e, B:275:0x0606, B:276:0x0613, B:278:0x0619, B:279:0x0636, B:281:0x063f, B:286:0x064e, B:288:0x065a, B:290:0x066a, B:291:0x066e, B:293:0x067a, B:295:0x068b, B:297:0x0691, B:299:0x069d, B:301:0x06ac, B:302:0x06b0, B:304:0x06b7, B:306:0x06d9, B:312:0x06e4, B:313:0x06e7, B:338:0x07b8), top: B:352:0x057d, inners: #7, #13 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x07a2 A[Catch: all -> 0x058a, TryCatch #5 {all -> 0x058a, blocks: (B:263:0x0583, B:329:0x0795, B:331:0x0799, B:333:0x079f, B:334:0x07a2, B:335:0x07a6, B:268:0x0595, B:274:0x05b8, B:314:0x06e8, B:315:0x0735, B:317:0x073b, B:318:0x0749, B:320:0x075a, B:322:0x0769, B:323:0x076d, B:325:0x0774, B:326:0x0781, B:340:0x07ba, B:341:0x07bd, B:271:0x059e, B:275:0x0606, B:276:0x0613, B:278:0x0619, B:279:0x0636, B:281:0x063f, B:286:0x064e, B:288:0x065a, B:290:0x066a, B:291:0x066e, B:293:0x067a, B:295:0x068b, B:297:0x0691, B:299:0x069d, B:301:0x06ac, B:302:0x06b0, B:304:0x06b7, B:306:0x06d9, B:312:0x06e4, B:313:0x06e7, B:338:0x07b8), top: B:352:0x057d, inners: #7, #13 }] */
    /* JADX WARN: Code duplicated, block: B:405:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.Object, w42] */
    /* JADX WARN: Type inference failed for: r1v18, types: [zh0] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [b80] */
    /* JADX WARN: Type inference failed for: r3v19, types: [b80, f40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [b80, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [b80, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [w42] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, w42] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0236 -> B:100:0x0219). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x024a -> B:100:0x0219). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1160sw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160sw(wp1 wp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f30598t = (byte) 3;
        this.f30604z = wp1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1160sw(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f30598t = b;
        this.f30602x = obj;
        this.f30603y = obj2;
        this.f30604z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160sw(f71 f71Var, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f30598t = (byte) 4;
        this.f30604z = f71Var;
        this.f30603y = mq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160sw(pe2 pe2Var, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f30598t = (byte) 5;
        this.f30602x = pe2Var;
        this.f30604z = mq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160sw(y24 y24Var, String str, wm0 wm0Var) {
        super(2, wm0Var);
        this.f30598t = (byte) 6;
        this.f30603y = y24Var;
        this.f30604z = str;
    }
}
