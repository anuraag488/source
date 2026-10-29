package p000;

import ads_mobile_sdk.C0061c8;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mn3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f25065t;

    /* JADX INFO: renamed from: u */
    public byte f25066u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ long f25067v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f25068w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn3(rn3 rn3Var, long j, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25065t = (byte) 0;
        this.f25068w = rn3Var;
        this.f25067v = j;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f25065t;
        Object obj2 = this.f25068w;
        switch (b) {
            case 0:
                return new mn3((rn3) obj2, this.f25067v, wm0Var);
            case 1:
                return new mn3((byte) 1, this.f25067v, wm0Var, (uf4) obj2);
            case 2:
                mn3 mn3Var = new mn3((pk4) obj2, wm0Var);
                mn3Var.f25067v = ((b33) obj).f15059a;
                return mn3Var;
            default:
                return new mn3((byte) 3, this.f25067v, wm0Var, (C0061c8) obj2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f25065t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((mn3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((mn3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((mn3) create((wm0) obj2, b33.m3423a(((b33) obj).f15059a))).invokeSuspend(ju4Var);
            default:
                byte b2 = 3;
                new mn3(b2, this.f25067v, (wm0) obj2, (C0061c8) this.f25068w).invokeSuspend(ju4Var);
                return ap0.f14763a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0056 -> B:14:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mn3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn3(byte b, long j, wm0 wm0Var, Object obj) {
        super(2, wm0Var);
        this.f25065t = b;
        this.f25067v = j;
        this.f25068w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn3(pk4 pk4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25065t = (byte) 2;
        this.f25068w = pk4Var;
    }
}
