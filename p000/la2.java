package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class la2 {

    /* JADX INFO: renamed from: b */
    public static final Charset f23889b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public ByteArrayInputStream f23890a;

    /* JADX INFO: renamed from: a */
    public static int m7887a(ba2 ba2Var) throws IOException {
        ba2Var.getClass();
        if (!(ba2Var instanceof gb2)) {
            wb1.m12191j("invalid key id: not a JSON primitive");
            return 0;
        }
        if (!(ba2Var.m3529m().f19705a instanceof Number)) {
            wb1.m12191j("invalid key id: not a JSON number");
            return 0;
        }
        Number numberMo3531r = ba2Var.m3529m().mo3531r();
        try {
            ab2 ab2Var = cb2.f15914a;
            if (!(numberMo3531r instanceof bb2)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long j = Long.parseLong(((bb2) numberMo3531r).f15197a);
            if (j <= 4294967295L && j >= -2147483648L) {
                return (int) j;
            }
            wb1.m12191j("invalid key id");
            return 0;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:199:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0351 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static wd2 m7888b(wa2 wa2Var) throws IOException {
        byte b;
        hd2 hd2Var;
        String strMo3532s;
        j63 j63Var;
        pl2 pl2Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        qc2 qc2Var;
        pl2 pl2Var2 = wa2Var.f33192a;
        if (!pl2Var2.containsKey("key")) {
            throw new za2("invalid keyset: no key");
        }
        ba2 ba2VarM12186z = wa2Var.m12186z("key");
        ba2VarM12186z.getClass();
        if (!(ba2VarM12186z instanceof o92)) {
            throw new za2("invalid keyset: key must be an array");
        }
        ArrayList arrayList = ba2VarM12186z.m3527g().f26491a;
        if (arrayList.size() == 0) {
            throw new za2("invalid keyset: key is empty");
        }
        td2 td2VarM12226C = wd2.m12226C();
        if (pl2Var2.containsKey("primaryKeyId")) {
            int iM7887a = m7887a(wa2Var.m12186z("primaryKeyId"));
            td2VarM12226C.m9631e();
            ((wd2) td2VarM12226C.f27912b).m12230E(iM7887a);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            wa2 wa2VarM3528l = ((ba2) arrayList.get(i7)).m3528l();
            pl2 pl2Var3 = wa2VarM3528l.f33192a;
            if (!pl2Var3.containsKey("keyData") || !pl2Var3.containsKey("status") || !pl2Var3.containsKey("keyId") || !pl2Var3.containsKey("outputPrefixType")) {
                throw new za2("invalid key");
            }
            ba2 ba2VarM12186z2 = wa2VarM3528l.m12186z("keyData");
            ba2VarM12186z2.getClass();
            if (!(ba2VarM12186z2 instanceof wa2)) {
                throw new za2("invalid key: keyData must be an object");
            }
            ud2 ud2VarM11805C = vd2.m11805C();
            String strMo3532s2 = wa2VarM3528l.m12186z("status").mo3532s();
            strMo3532s2.getClass();
            switch (strMo3532s2.hashCode()) {
                case -891611359:
                    if (strMo3532s2.equals("ENABLED")) {
                        b = 0;
                    }
                    switch (b) {
                        case 0:
                            hd2Var = hd2.f20489c;
                            break;
                        case 1:
                            hd2Var = hd2.f20491e;
                            break;
                        case 2:
                            hd2Var = hd2.f20490d;
                            break;
                        default:
                            throw new za2("unknown status: ".concat(strMo3532s2));
                    }
                    ud2VarM11805C.m9631e();
                    ((vd2) ud2VarM11805C.f27912b).m11811G(hd2Var);
                    int iM7887a2 = m7887a(wa2VarM3528l.m12186z("keyId"));
                    ud2VarM11805C.m9631e();
                    ((vd2) ud2VarM11805C.f27912b).m11809E(iM7887a2);
                    strMo3532s = wa2VarM3528l.m12186z("outputPrefixType").mo3532s();
                    strMo3532s.getClass();
                    switch (strMo3532s) {
                        case "LEGACY":
                            j63Var = j63.f22046d;
                            break;
                        case "RAW":
                            j63Var = j63.f22047e;
                            break;
                        case "TINK":
                            j63Var = j63.f22045c;
                            break;
                        case "CRUNCHY":
                            j63Var = j63.f22048f;
                            break;
                        default:
                            throw new za2("unknown output prefix type: ".concat(strMo3532s));
                    }
                    ud2VarM11805C.m9631e();
                    ((vd2) ud2VarM11805C.f27912b).m11810F(j63Var);
                    wa2 wa2VarM3528l2 = ba2VarM12186z2.m3528l();
                    pl2Var = wa2VarM3528l2.f33192a;
                    if (pl2Var.containsKey("typeUrl") || !pl2Var.containsKey("value") || !pl2Var.containsKey("keyMaterialType")) {
                        throw new za2("invalid keyData");
                    }
                    byte[] bytes = wa2VarM3528l2.m12186z("value").mo3532s().getBytes(AbstractC0470ax.f14923a);
                    int length = bytes.length;
                    int i8 = (length * 3) / 4;
                    byte[] bArr = new byte[i8];
                    int[] iArr = C0006a5.f102b;
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i9 < length) {
                            if (i10 == 0) {
                                while (true) {
                                    int i13 = i9 + 4;
                                    if (i13 <= length) {
                                        int i14 = (iArr[bytes[i9] & 255] << 18) | (iArr[bytes[i9 + 1] & 255] << 12) | (iArr[bytes[i9 + 2] & 255] << 6) | iArr[bytes[i9 + 3] & 255];
                                        if (i14 >= 0) {
                                            bArr[i12 + 2] = (byte) i14;
                                            bArr[i12 + 1] = (byte) (i14 >> 8);
                                            bArr[i12] = (byte) (i14 >> 16);
                                            i12 += 3;
                                            i9 = i13;
                                            i11 = i14;
                                        } else {
                                            i11 = i14;
                                        }
                                    }
                                }
                                if (i9 >= length) {
                                    i2 = 1;
                                    i = -1;
                                }
                                C1077qn.m9987m("bad base-64");
                                return null;
                            }
                            int i15 = i9 + 1;
                            int i16 = iArr[bytes[i9] & 255];
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 != 4) {
                                                if (i10 == 5) {
                                                    if (i16 != -1) {
                                                        C1077qn.m9987m("bad base-64");
                                                        return null;
                                                    }
                                                }
                                            } else if (i16 == -2) {
                                                i10++;
                                            } else if (i16 != -1) {
                                                C1077qn.m9987m("bad base-64");
                                                return null;
                                            }
                                        } else if (i16 >= 0) {
                                            int i17 = i16 | (i11 << 6);
                                            bArr[i12 + 2] = (byte) i17;
                                            bArr[i12 + 1] = (byte) (i17 >> 8);
                                            bArr[i12] = (byte) (i17 >> 16);
                                            i12 += 3;
                                            i11 = i17;
                                            i10 = 0;
                                        } else if (i16 == -2) {
                                            bArr[i12 + 1] = (byte) (i11 >> 2);
                                            bArr[i12] = (byte) (i11 >> 10);
                                            i12 += 2;
                                            i10 = 5;
                                        } else if (i16 != -1) {
                                            C1077qn.m9987m("bad base-64");
                                            return null;
                                        }
                                    } else if (i16 >= 0) {
                                        i10++;
                                        i11 = i16 | (i11 << 6);
                                    } else if (i16 == -2) {
                                        bArr[i12] = (byte) (i11 >> 4);
                                        i12++;
                                        i10 = 4;
                                    } else if (i16 != -1) {
                                        C1077qn.m9987m("bad base-64");
                                        return null;
                                    }
                                } else if (i16 >= 0) {
                                    i16 |= i11 << 6;
                                    i10++;
                                    i11 = i16;
                                } else if (i16 != -1) {
                                    C1077qn.m9987m("bad base-64");
                                    return null;
                                }
                            } else if (i16 >= 0) {
                                i10++;
                                i11 = i16;
                            } else if (i16 != -1) {
                                C1077qn.m9987m("bad base-64");
                                return null;
                            }
                            i9 = i15;
                        } else {
                            i = -1;
                            i2 = 1;
                        }
                    }
                    if (i10 != i2) {
                        if (i10 != 2) {
                            i3 = 3;
                            if (i10 == 3) {
                                int i18 = i12 + 1;
                                bArr[i12] = (byte) (i11 >> 10);
                                i12 += 2;
                                bArr[i18] = (byte) (i11 >> 2);
                            } else if (i10 == 4) {
                            }
                            i4 = i12;
                        } else {
                            i3 = 3;
                            i4 = i12 + 1;
                            bArr[i12] = (byte) (i11 >> 4);
                        }
                        if (i4 == i8) {
                            i5 = 0;
                        } else {
                            byte[] bArr2 = new byte[i4];
                            i5 = 0;
                            System.arraycopy(bArr, 0, bArr2, 0, i4);
                            bArr = bArr2;
                        }
                        pc2 pc2VarM10285B = rc2.m10285B();
                        String strMo3532s3 = wa2VarM3528l2.m12186z("typeUrl").mo3532s();
                        pc2VarM10285B.m9631e();
                        ((rc2) pc2VarM10285B.f27912b).m10289D(strMo3532s3);
                        o50 o50VarM10980d = t50.m10980d(bArr, i5, bArr.length);
                        pc2VarM10285B.m9631e();
                        ((rc2) pc2VarM10285B.f27912b).m10290E(o50VarM10980d);
                        String strMo3532s4 = wa2VarM3528l2.m12186z("keyMaterialType").mo3532s();
                        strMo3532s4.getClass();
                        switch (strMo3532s4.hashCode()) {
                            case -1881281466:
                                i6 = strMo3532s4.equals("REMOTE") ? i5 : i;
                                break;
                            case -1609477353:
                                i6 = strMo3532s4.equals("SYMMETRIC") ? i2 : i;
                                break;
                            case 249237018:
                                i6 = strMo3532s4.equals("ASYMMETRIC_PRIVATE") ? 2 : i;
                                break;
                            case 1534613202:
                                i6 = strMo3532s4.equals("ASYMMETRIC_PUBLIC") ? i3 : i;
                                break;
                            default:
                                i6 = i;
                                break;
                        }
                        switch (i6) {
                            case 0:
                                qc2Var = qc2.f28379f;
                                break;
                            case 1:
                                qc2Var = qc2.f28376c;
                                break;
                            case 2:
                                qc2Var = qc2.f28377d;
                                break;
                            case 3:
                                qc2Var = qc2.f28378e;
                                break;
                            default:
                                throw new za2("unknown key material type: ".concat(strMo3532s4));
                        }
                        pc2VarM10285B.m9631e();
                        ((rc2) pc2VarM10285B.f27912b).m10288C(qc2Var);
                        rc2 rc2Var = (rc2) pc2VarM10285B.m9628b();
                        ud2VarM11805C.m9631e();
                        ((vd2) ud2VarM11805C.f27912b).m11808D(rc2Var);
                        vd2 vd2Var = (vd2) ud2VarM11805C.m9628b();
                        td2VarM12226C.m9631e();
                        ((wd2) td2VarM12226C.f27912b).m12231x(vd2Var);
                        break;
                    }
                    C1077qn.m9987m("bad base-64");
                    return null;
                case 478389753:
                    if (strMo3532s2.equals("DESTROYED")) {
                        b = 1;
                    }
                    switch (b) {
                        case 0:
                            hd2Var = hd2.f20489c;
                            break;
                        case 1:
                            hd2Var = hd2.f20491e;
                            break;
                        case 2:
                            hd2Var = hd2.f20490d;
                            break;
                        default:
                            throw new za2("unknown status: ".concat(strMo3532s2));
                    }
                    ud2VarM11805C.m9631e();
                    ((vd2) ud2VarM11805C.f27912b).m11811G(hd2Var);
                    int iM7887a3 = m7887a(wa2VarM3528l.m12186z("keyId"));
                    ud2VarM11805C.m9631e();
                    ((vd2) ud2VarM11805C.f27912b).m11809E(iM7887a3);
                    strMo3532s = wa2VarM3528l.m12186z("outputPrefixType").mo3532s();
                    strMo3532s.getClass();
                    switch (strMo3532s) {
                        case -2053249079:
                            if (!strMo3532s.equals("LEGACY")) {
                            }
                            break;
                        case 80904:
                            if (!strMo3532s.equals("RAW")) {
                            }
                            break;
                        case 2575090:
                            if (!strMo3532s.equals("TINK")) {
                            }
                            break;
                        case 1761684556:
                            if (!strMo3532s.equals("CRUNCHY")) {
                            }
                            break;
                        default:
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        */
                    /*
                        Method dump skipped, instruction units count: 988
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.la2.m7888b(wa2):wd2");
                }
            }
