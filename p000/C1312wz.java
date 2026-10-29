package p000;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: wz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1312wz extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f33865t;

    /* JADX INFO: renamed from: u */
    public byte f33866u;

    /* JADX INFO: renamed from: v */
    public Object f33867v;

    /* JADX INFO: renamed from: w */
    public Object f33868w;

    /* JADX INFO: renamed from: x */
    public Object f33869x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f33870y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312wz(zm3 zm3Var, Map map, C1312wz c1312wz, C1108rh c1108rh, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33865t = (byte) 7;
        this.f33868w = zm3Var;
        this.f33867v = map;
        this.f33869x = c1312wz;
        this.f33870y = c1108rh;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f33865t;
        Object obj2 = this.f33870y;
        switch (b) {
            case 0:
                C1312wz c1312wz = new C1312wz(this.f33869x, obj2, wm0Var, (byte) 0);
                c1312wz.f33867v = obj;
                return c1312wz;
            case 1:
                C1312wz c1312wz2 = new C1312wz(obj2, wm0Var, (byte) 1);
                c1312wz2.f33867v = obj;
                return c1312wz2;
            case 2:
                return new C1312wz((q54) this.f33868w, (si1) this.f33869x, (qw2) obj2, this.f33867v, wm0Var);
            case 3:
                C1312wz c1312wz3 = new C1312wz(this.f33869x, obj2, wm0Var, (byte) 3);
                c1312wz3.f33867v = obj;
                return c1312wz3;
            case 4:
                C1312wz c1312wz4 = new C1312wz(this.f33868w, this.f33869x, obj2, wm0Var, (byte) 4);
                c1312wz4.f33867v = obj;
                return c1312wz4;
            case 5:
                return new C1312wz((tb3) obj2, (mq1) this.f33869x, wm0Var);
            case 6:
                C1312wz c1312wz5 = new C1312wz(obj2, wm0Var, (byte) 6);
                c1312wz5.f33867v = obj;
                return c1312wz5;
            case 7:
                return new C1312wz((zm3) this.f33868w, (Map) this.f33867v, (C1312wz) this.f33869x, (C1108rh) obj2, wm0Var);
            case 8:
                return new C1312wz((gx2) this.f33867v, (mq1) obj2, wm0Var);
            case 9:
                C1312wz c1312wz6 = new C1312wz((yp1) this.f33868w, (AtomicReference) obj2, (mq1) this.f33869x, wm0Var);
                c1312wz6.f33867v = obj;
                return c1312wz6;
            case 10:
                C1312wz c1312wz7 = new C1312wz(obj2, wm0Var, (byte) 10);
                c1312wz7.f33867v = obj;
                return c1312wz7;
            default:
                C1312wz c1312wz8 = new C1312wz(this.f33868w, this.f33869x, obj2, wm0Var, (byte) 11);
                c1312wz8.f33867v = obj;
                return c1312wz8;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f33865t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 4:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C1312wz) create((wm0) obj2, (JSONObject) obj)).invokeSuspend(ju4Var);
            case 7:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 8:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 9:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 10:
                return ((C1312wz) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                ((C1312wz) create((wm0) obj2, (ti1) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:378:0x07c1 A[PHI: r1 r2
  0x07c1: PHI (r1v11 ql3) = (r1v19 ql3), (r1v37 ql3) binds: [B:402:0x0844, B:377:0x07c0] A[DONT_GENERATE, DONT_INLINE]
  0x07c1: PHI (r2v9 ??) = (r2v131 ??), (r2v132 ??) binds: [B:402:0x0844, B:377:0x07c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:383:0x07f0 A[PHI: r3
  0x07f0: PHI (r3v13 ??) = (r3v92 ??), (r3v93 ??), (r3v94 ??), (r3v95 ??), (r3v11 ??), (r3v16 ??), (r3v96 ??) binds: [B:425:0x088d, B:409:0x085b, B:414:0x0865, B:418:0x0873, B:427:0x0891, B:382:0x07e8, B:374:0x07b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:385:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:387:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:390:0x080f  */
    /* JADX WARN: Code duplicated, block: B:395:0x081f  */
    /* JADX WARN: Code duplicated, block: B:398:0x0832  */
    /* JADX WARN: Code duplicated, block: B:413:0x0862 A[Catch: CancellationException -> 0x085e, TryCatch #4 {CancellationException -> 0x085e, blocks: (B:408:0x0855, B:413:0x0862, B:415:0x0867), top: B:466:0x0855 }] */
    /* JADX WARN: Code duplicated, block: B:415:0x0867 A[Catch: CancellationException -> 0x085e, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x085e, blocks: (B:408:0x0855, B:413:0x0862, B:415:0x0867), top: B:466:0x0855 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, si1] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, qw2, ti1] */
    /* JADX WARN: Type inference failed for: r1v124, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v125, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v135, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v154 */
    /* JADX WARN: Type inference failed for: r1v155 */
    /* JADX WARN: Type inference failed for: r1v157 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v8, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v131 */
    /* JADX WARN: Type inference failed for: r2v132 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, zo0] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:326:0x06ce -> B:322:0x06a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:328:0x06f0 -> B:322:0x06a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:409:0x085b -> B:383:0x07f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:414:0x0865 -> B:383:0x07f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:418:0x0873 -> B:383:0x07f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:425:0x088d -> B:383:0x07f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:427:0x0891 -> B:383:0x07f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0173 -> B:68:0x0140). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1312wz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312wz(gx2 gx2Var, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33865t = (byte) 8;
        this.f33867v = gx2Var;
        this.f33870y = mq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312wz(tb3 tb3Var, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33865t = (byte) 5;
        this.f33870y = tb3Var;
        this.f33869x = mq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312wz(yp1 yp1Var, AtomicReference atomicReference, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33865t = (byte) 9;
        this.f33868w = yp1Var;
        this.f33870y = atomicReference;
        this.f33869x = mq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312wz(q54 q54Var, si1 si1Var, qw2 qw2Var, Object obj, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33865t = (byte) 2;
        this.f33868w = q54Var;
        this.f33869x = si1Var;
        this.f33870y = qw2Var;
        this.f33867v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1312wz(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f33865t = b;
        this.f33870y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1312wz(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f33865t = b;
        this.f33869x = obj;
        this.f33870y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1312wz(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f33865t = b;
        this.f33868w = obj;
        this.f33869x = obj2;
        this.f33870y = obj3;
    }
}
