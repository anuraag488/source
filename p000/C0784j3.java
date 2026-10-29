package p000;

import ads_mobile_sdk.C0447zn;
import ads_mobile_sdk.f84;
import ads_mobile_sdk.ff3;
import ads_mobile_sdk.gr2;
import ads_mobile_sdk.j10;
import ads_mobile_sdk.kh3;
import ads_mobile_sdk.nh1;
import ads_mobile_sdk.pr2;
import ads_mobile_sdk.vx3;
import ads_mobile_sdk.yz0;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0784j3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f21977t;

    /* JADX INFO: renamed from: u */
    public byte f21978u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f21979v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0784j3(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f21977t = b;
        this.f21979v = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f21977t;
        Object obj2 = this.f21979v;
        switch (b) {
            case 0:
                return new C0784j3((yp1) obj2, wm0Var, (byte) 0);
            case 1:
                return new C0784j3((ru0) obj2, wm0Var, (byte) 1);
            case 2:
                return new C0784j3((u93) obj2, wm0Var, (byte) 2);
            case 3:
                return new C0784j3((kp2) obj2, wm0Var, (byte) 3);
            case 4:
                return new C0784j3((ft2) obj2, wm0Var, (byte) 4);
            case 5:
                return new C0784j3((vf4) obj2, wm0Var, (byte) 5);
            case 6:
                return new C0784j3((pk4) obj2, wm0Var, (byte) 6);
            case 7:
                return new C0784j3((j10) obj2, wm0Var, (byte) 7);
            case 8:
                return new C0784j3((nh1) obj2, wm0Var, (byte) 8);
            case 9:
                return new C0784j3((gr2) obj2, wm0Var, (byte) 9);
            case 10:
                return new C0784j3((kh3) obj2, wm0Var, (byte) 10);
            case 11:
                return new C0784j3((yz0) obj2, wm0Var, (byte) 11);
            case 12:
                return new C0784j3((pr2) obj2, wm0Var, (byte) 12);
            case 13:
                return new C0784j3((C0447zn) obj2, wm0Var, (byte) 13);
            case 14:
                return new C0784j3((f84) obj2, wm0Var, (byte) 14);
            case 15:
                return new C0784j3((vx3) obj2, wm0Var, (byte) 15);
            default:
                return new C0784j3((ff3) obj2, wm0Var, (byte) 16);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21977t;
        Object obj3 = this.f21979v;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0784j3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0784j3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0784j3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                ((C0784j3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 4:
                return ((C0784j3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C0784j3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C0784j3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 7:
                return new C0784j3((j10) obj3, (wm0) obj2, (byte) 7).invokeSuspend(ju4Var);
            case 8:
                return new C0784j3((nh1) obj3, (wm0) obj2, (byte) 8).invokeSuspend(ju4Var);
            case 9:
                return new C0784j3((gr2) obj3, (wm0) obj2, (byte) 9).invokeSuspend(ju4Var);
            case 10:
                new C0784j3((kh3) obj3, (wm0) obj2, (byte) 10).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 11:
                return new C0784j3((yz0) obj3, (wm0) obj2, (byte) 11).invokeSuspend(ju4Var);
            case 12:
                return new C0784j3((pr2) obj3, (wm0) obj2, (byte) 12).invokeSuspend(ju4Var);
            case 13:
                return new C0784j3((C0447zn) obj3, (wm0) obj2, (byte) 13).invokeSuspend(ju4Var);
            case 14:
                return new C0784j3((f84) obj3, (wm0) obj2, (byte) 14).invokeSuspend(ju4Var);
            case 15:
                return new C0784j3((vx3) obj3, (wm0) obj2, (byte) 15).invokeSuspend(ju4Var);
            default:
                return new C0784j3((ff3) obj3, (wm0) obj2, (byte) 16).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:450:0x0822  */
    /* JADX WARN: Code duplicated, block: B:452:0x0827  */
    /* JADX WARN: Code duplicated, block: B:454:0x0833  */
    /* JADX WARN: Code duplicated, block: B:495:0x08df  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x023e -> B:134:0x022b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x0242 -> B:134:0x022b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:433:0x07d6 -> B:427:0x07c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:435:0x07f9 -> B:438:0x07fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:458:0x084d -> B:452:0x0827). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 2332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0784j3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
