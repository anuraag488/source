package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class do5 implements Iterable, aq5, ip5 {

    /* JADX INFO: renamed from: a */
    public final TreeMap f17247a;

    /* JADX INFO: renamed from: b */
    public final TreeMap f17248b;

    public do5(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m4630v(i, (aq5) list.get(i));
            }
        }
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: a */
    public final Boolean mo3116a() {
        return Boolean.TRUE;
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: c */
    public final void mo4623c(String str, aq5 aq5Var) {
        TreeMap treeMap = this.f17248b;
        if (aq5Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, aq5Var);
        }
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: d */
    public final aq5 mo4624d(String str) {
        aq5 aq5Var;
        if ("length".equals(str)) {
            return new xo5(Double.valueOf(m4628t()));
        }
        return (!mo4625e(str) || (aq5Var = (aq5) this.f17248b.get(str)) == null) ? aq5.f14781np : aq5Var;
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: e */
    public final boolean mo4625e(String str) {
        return "length".equals(str) || this.f17248b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof do5)) {
            return false;
        }
        do5 do5Var = (do5) obj;
        if (m4628t() != do5Var.m4628t()) {
            return false;
        }
        TreeMap treeMap = this.f17247a;
        if (treeMap.isEmpty()) {
            return do5Var.f17247a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m4629u(iIntValue).equals(do5Var.m4629u(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final List m4626g() {
        ArrayList arrayList = new ArrayList(m4628t());
        for (int i = 0; i < m4628t(); i++) {
            arrayList.add(m4629u(i));
        }
        return arrayList;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: h */
    public final String mo3117h() {
        return m4633y(",");
    }

    public final int hashCode() {
        return this.f17247a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s84 s84Var = new s84((byte) 1);
        s84Var.f29971c = this;
        s84Var.f29970b = 0;
        VarHandle.storeStoreFence();
        return s84Var;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: l */
    public final Iterator mo3118l() {
        Iterator it = this.f17247a.keySet().iterator();
        Iterator it2 = this.f17248b.keySet().iterator();
        ne3 ne3Var = new ne3((byte) 1);
        ne3Var.f25734b = it;
        ne3Var.f25735c = it2;
        VarHandle.storeStoreFence();
        return ne3Var;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: m */
    public final Double mo3119m() {
        TreeMap treeMap = this.f17247a;
        if (treeMap.size() == 1) {
            return m4629u(0).mo3119m();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x023d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:113:0x026d  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c A[LOOP:2: B:115:0x0277->B:117:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x029d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0301  */
    /* JADX WARN: Code duplicated, block: B:147:0x0314  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318  */
    /* JADX WARN: Code duplicated, block: B:149:0x031e  */
    /* JADX WARN: Code duplicated, block: B:152:0x033b A[LOOP:3: B:151:0x0339->B:152:0x033b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x034b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0351  */
    /* JADX WARN: Code duplicated, block: B:158:0x0368  */
    /* JADX WARN: Code duplicated, block: B:161:0x036f  */
    /* JADX WARN: Code duplicated, block: B:164:0x037b  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:175:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d8 A[LOOP:5: B:178:0x03d6->B:179:0x03d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:184:0x0407  */
    /* JADX WARN: Code duplicated, block: B:186:0x0411  */
    /* JADX WARN: Code duplicated, block: B:188:0x0414  */
    /* JADX WARN: Code duplicated, block: B:190:0x041a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0437  */
    /* JADX WARN: Code duplicated, block: B:197:0x043a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0446  */
    /* JADX WARN: Code duplicated, block: B:202:0x044e  */
    /* JADX WARN: Code duplicated, block: B:205:0x045a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0464  */
    /* JADX WARN: Code duplicated, block: B:209:0x046c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0483  */
    /* JADX WARN: Code duplicated, block: B:213:0x0489  */
    /* JADX WARN: Code duplicated, block: B:215:0x048f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0497  */
    /* JADX WARN: Code duplicated, block: B:219:0x049c  */
    /* JADX WARN: Code duplicated, block: B:221:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:223:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:225:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ca A[LOOP:6: B:224:0x04b4->B:227:0x04ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x04e7 A[LOOP:7: B:230:0x04e1->B:232:0x04e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x050b A[LOOP:8: B:234:0x0505->B:236:0x050b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0530  */
    /* JADX WARN: Code duplicated, block: B:241:0x0538  */
    /* JADX WARN: Code duplicated, block: B:243:0x0542  */
    /* JADX WARN: Code duplicated, block: B:246:0x0560  */
    /* JADX WARN: Code duplicated, block: B:248:0x057c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0584  */
    /* JADX WARN: Code duplicated, block: B:252:0x0594  */
    /* JADX WARN: Code duplicated, block: B:253:0x059b  */
    /* JADX WARN: Code duplicated, block: B:256:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:260:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:269:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:271:0x05de  */
    /* JADX WARN: Code duplicated, block: B:273:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:276:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:278:0x0603  */
    /* JADX WARN: Code duplicated, block: B:280:0x0608  */
    /* JADX WARN: Code duplicated, block: B:282:0x0610  */
    /* JADX WARN: Code duplicated, block: B:284:0x0616  */
    /* JADX WARN: Code duplicated, block: B:286:0x061c  */
    /* JADX WARN: Code duplicated, block: B:288:0x063e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0649  */
    /* JADX WARN: Code duplicated, block: B:291:0x064f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0663  */
    /* JADX WARN: Code duplicated, block: B:296:0x0681  */
    /* JADX WARN: Code duplicated, block: B:299:0x068a A[LOOP:10: B:297:0x0682->B:299:0x068a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x06a2 A[LOOP:11: B:302:0x06a2->B:318:0x06f4, LOOP_START, PHI: r9 r35
  0x06a2: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:301:0x06a0, B:318:0x06f4] A[DONT_GENERATE, DONT_INLINE]
  0x06a2: PHI (r35v1 java.util.TreeMap) = (r35v0 java.util.TreeMap), (r35v4 java.util.TreeMap) binds: [B:301:0x06a0, B:318:0x06f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:304:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:306:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:308:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:310:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:311:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:313:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:315:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:323:0x0711 A[LOOP:13: B:323:0x0711->B:325:0x0714, LOOP_START, PHI: r0
  0x0711: PHI (r0v33 int) = (r0v32 int), (r0v34 int) binds: [B:293:0x0661, B:325:0x0714] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x0714 A[LOOP:13: B:323:0x0711->B:325:0x0714, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:327:0x0726  */
    /* JADX WARN: Code duplicated, block: B:329:0x072e  */
    /* JADX WARN: Code duplicated, block: B:331:0x0734  */
    /* JADX WARN: Code duplicated, block: B:333:0x073f  */
    /* JADX WARN: Code duplicated, block: B:335:0x0755  */
    /* JADX WARN: Code duplicated, block: B:337:0x075b  */
    /* JADX WARN: Code duplicated, block: B:339:0x0761  */
    /* JADX WARN: Code duplicated, block: B:342:0x077f A[LOOP:14: B:340:0x0779->B:342:0x077f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x0796  */
    /* JADX WARN: Code duplicated, block: B:345:0x079b  */
    /* JADX WARN: Code duplicated, block: B:347:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:349:0x07af  */
    /* JADX WARN: Code duplicated, block: B:351:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:353:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:358:0x07de A[LOOP:16: B:356:0x07d8->B:358:0x07de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x0801  */
    /* JADX WARN: Code duplicated, block: B:364:0x0809  */
    /* JADX WARN: Code duplicated, block: B:366:0x0819  */
    /* JADX WARN: Code duplicated, block: B:375:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x04d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x06f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x06ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x07f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:72:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (p000.w76.m12157d(r7, r2, (p000.vp5) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m4628t() != r7.m4628t()) goto L170;
     */
    @Override // p000.aq5
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aq5 mo3120q(String str, r36 r36Var, ArrayList arrayList) {
        String str2;
        Object obj;
        String str3;
        Object obj2;
        Double dValueOf;
        int iHashCode;
        aq5 aq5VarM13122t;
        TreeMap treeMap;
        double dM4628t;
        String str4;
        do5 do5Var;
        int size;
        int i;
        aq5 aq5VarM13122t2;
        int iM4628t;
        do5 do5Var2;
        Iterator itM4627s;
        String str5;
        aq5 aq5VarM13122t3;
        do5 do5Var3;
        do5 do5Var4;
        Iterator itM4627s2;
        yg3 yg3Var;
        int iM12163j;
        int iM4628t2;
        do5 do5Var5;
        int iMax;
        int i2;
        aq5 aq5VarM13122t4;
        int i3;
        int iIntValue;
        TreeMap treeMap2;
        Integer numValueOf;
        TreeMap treeMap3;
        aq5 aq5Var;
        int i4;
        String str6;
        aq5 aq5VarM13122t5;
        int iM4628t3;
        double dM12163j;
        int iMin;
        aq5 aq5VarM13122t6;
        do5 do5Var6;
        int size2;
        int i5;
        int iM4628t4;
        Iterator itM4627s3;
        Iterator itM4627s4;
        aq5 aq5VarM13122t7;
        aq5 aq5VarM13122t8;
        int iM4628t5;
        String strMo3117h;
        aq5 aq5VarM13122t9;
        int size3;
        int i6;
        aq5 aq5VarM13122t10;
        Iterator itM4627s5;
        int iIntValue2;
        dp5 dp5Var;
        ArrayList arrayList2;
        int size4;
        int i7;
        int i8;
        aq5 aq5VarM13122t11;
        aq5 aq5VarM13122t12;
        double dM4628t2;
        double dM12163j2;
        double dMin;
        do5 do5Var7;
        int i9;
        double dM12163j3;
        int iM4628t6;
        int i10;
        int i11;
        Iterator itM4627s6;
        double d;
        double dM12163j4;
        String str7 = "toString";
        String str8 = "forEach";
        String str9 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str2 = "filter";
            str3 = "sort";
            if (str3.equals(str)) {
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str9.equals(str)) {
                    str9 = str9;
                } else if (str7.equals(str)) {
                    str9 = str9;
                    str7 = str7;
                } else {
                    if (!"unshift".equals(str)) {
                        str9 = str9;
                        str7 = str7;
                        return ip5.m6850b(this, new sq5(str), r36Var, arrayList);
                    }
                    str9 = str9;
                    str7 = str7;
                    obj = "unshift";
                }
            }
            obj = "unshift";
            r36Var = r36Var;
            str8 = "forEach";
            this = this;
            dValueOf = Double.valueOf(-1.0d);
            iHashCode = str.hashCode();
            TreeMap treeMap4 = this.f17247a;
            aq5VarM13122t = aq5.f14781np;
            treeMap = treeMap4;
            dM4628t = 0.0d;
            switch (iHashCode) {
                case -1776922004:
                    str4 = str7;
                    if (str.equals(str4)) {
                        w76.m12154a(str4, 0, arrayList);
                        return new sq5(this.m4633y(","));
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        do5Var = (do5) this.mo3121r();
                        if (!arrayList.isEmpty()) {
                            size = arrayList.size();
                            i = 0;
                            while (i < size) {
                                Object obj3 = arrayList.get(i);
                                i++;
                                aq5VarM13122t2 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) obj3);
                                if (!(aq5VarM13122t2 instanceof po5)) {
                                    C1077qn.m9989o("Failed evaluation of arguments");
                                    return null;
                                }
                                iM4628t = do5Var.m4628t();
                                if (aq5VarM13122t2 instanceof do5) {
                                    do5Var2 = (do5) aq5VarM13122t2;
                                    itM4627s = do5Var2.m4627s();
                                    while (itM4627s.hasNext()) {
                                        Integer num = (Integer) itM4627s.next();
                                        do5Var.m4630v(num.intValue() + iM4628t, do5Var2.m4629u(num.intValue()));
                                    }
                                } else {
                                    do5Var.m4630v(iM4628t, aq5VarM13122t2);
                                }
                            }
                        }
                        return do5Var;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case -1274492040:
                    str5 = str2;
                    if (str.equals(str5)) {
                        w76.m12154a(str5, 1, arrayList);
                        aq5VarM13122t3 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        if (aq5VarM13122t3 instanceof vp5) {
                            C1077qn.m9987m("Callback should be a method");
                            return null;
                        }
                        if (treeMap.size() == 0) {
                            return new do5();
                        }
                        do5Var3 = (do5) this.mo3121r();
                        do5 do5VarM12157d = w76.m12157d(this, r36Var, (vp5) aq5VarM13122t3, null, Boolean.TRUE);
                        do5Var4 = new do5();
                        itM4627s2 = do5VarM12157d.m4627s();
                        while (itM4627s2.hasNext()) {
                            do5Var4.m4630v(do5Var4.m4628t(), do5Var3.m4629u(((Integer) itM4627s2.next()).intValue()));
                        }
                        return do5Var4;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return w76.m12155b(this, r36Var, arrayList, true);
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str9)) {
                        if (arrayList.isEmpty()) {
                            return new do5();
                        }
                        aq5 aq5Var2 = (aq5) arrayList.get(0);
                        yg3 yg3Var2 = (yg3) r36Var.f28986b;
                        yg3Var = (yg3) r36Var.f28986b;
                        iM12163j = (int) w76.m12163j(yg3Var2.m13122t(r36Var, aq5Var2).mo3119m().doubleValue());
                        if (iM12163j < 0) {
                            iM12163j = Math.max(0, this.m4628t() + iM12163j);
                        } else if (iM12163j > this.m4628t()) {
                            iM12163j = this.m4628t();
                        }
                        iM4628t2 = this.m4628t();
                        do5Var5 = new do5();
                        if (arrayList.size() > 1) {
                            iMax = Math.max(0, (int) w76.m12163j(yg3Var.m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue()));
                            if (iMax > 0) {
                                for (i4 = iM12163j; i4 < Math.min(iM4628t2, iM12163j + iMax); i4++) {
                                    do5Var5.m4630v(do5Var5.m4628t(), this.m4629u(iM12163j));
                                    this.m4632x(iM12163j);
                                }
                            }
                            i2 = 2;
                            if (arrayList.size() > 2) {
                                while (i2 < arrayList.size()) {
                                    aq5VarM13122t4 = yg3Var.m13122t(r36Var, (aq5) arrayList.get(i2));
                                    if (!(aq5VarM13122t4 instanceof po5)) {
                                        C1077qn.m9987m("Failed to parse elements to add");
                                        return null;
                                    }
                                    i3 = (iM12163j + i2) - 2;
                                    if (i3 >= 0) {
                                        qm5.m9913d(String.valueOf(i3).length() + 21, i3, "Invalid value index: ");
                                        return null;
                                    }
                                    if (i3 >= this.m4628t()) {
                                        this.m4630v(i3, aq5VarM13122t4);
                                        treeMap2 = treeMap;
                                    } else {
                                        iIntValue = ((Integer) treeMap.lastKey()).intValue();
                                        while (iIntValue >= i3) {
                                            numValueOf = Integer.valueOf(iIntValue);
                                            treeMap3 = treeMap;
                                            aq5Var = (aq5) treeMap3.get(numValueOf);
                                            if (aq5Var != null) {
                                                this.m4630v(iIntValue + 1, aq5Var);
                                                treeMap3.remove(numValueOf);
                                            }
                                            iIntValue--;
                                            treeMap = treeMap3;
                                        }
                                        treeMap2 = treeMap;
                                        this.m4630v(i3, aq5VarM13122t4);
                                    }
                                    i2++;
                                    treeMap = treeMap2;
                                }
                            }
                        } else {
                            while (iM12163j < iM4628t2) {
                                do5Var5.m4630v(do5Var5.m4628t(), this.m4629u(iM12163j));
                                this.m4630v(iM12163j, null);
                                iM12163j++;
                            }
                        }
                        return do5Var5;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case -678635926:
                    str6 = str8;
                    if (str.equals(str6)) {
                        w76.m12154a(str6, 1, arrayList);
                        aq5VarM13122t5 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        if (aq5VarM13122t5 instanceof vp5) {
                            C1077qn.m9987m("Callback should be a method");
                            return null;
                        }
                        if (treeMap.size() != 0) {
                            w76.m12157d(this, r36Var, (vp5) aq5VarM13122t5, null, null);
                            return aq5VarM13122t;
                        }
                        return aq5VarM13122t;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        w76.m12158e("lastIndexOf", 2, arrayList);
                        if (!arrayList.isEmpty()) {
                            aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        }
                        aq5 aq5Var3 = aq5VarM13122t;
                        iM4628t3 = this.m4628t() - 1;
                        if (arrayList.size() > 1) {
                            aq5VarM13122t6 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                            if (Double.isNaN(aq5VarM13122t6.mo3119m().doubleValue())) {
                                dM12163j = this.m4628t() - 1;
                            } else {
                                dM12163j = w76.m12163j(aq5VarM13122t6.mo3119m().doubleValue());
                            }
                            if (dM12163j < 0.0d) {
                                dM12163j += (double) this.m4628t();
                            }
                        } else {
                            dM12163j = iM4628t3;
                        }
                        if (dM12163j < 0.0d) {
                            return new xo5(dValueOf);
                        }
                        for (iMin = (int) Math.min(this.m4628t(), dM12163j); iMin >= 0; iMin--) {
                            if (!this.m4631w(iMin) && w76.m12161h(this.m4629u(iMin), aq5Var3)) {
                                return new xo5(Double.valueOf(iMin));
                            }
                        }
                        return new xo5(dValueOf);
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList.isEmpty()) {
                            do5Var6 = new do5();
                            size2 = arrayList.size();
                            i5 = 0;
                            while (i5 < size2) {
                                Object obj4 = arrayList.get(i5);
                                i5++;
                                aq5VarM13122t7 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) obj4);
                                if (!(aq5VarM13122t7 instanceof po5)) {
                                    C1077qn.m9989o("Argument evaluation failed");
                                    return null;
                                }
                                do5Var6.m4630v(do5Var6.m4628t(), aq5VarM13122t7);
                            }
                            iM4628t4 = do5Var6.m4628t();
                            itM4627s3 = this.m4627s();
                            while (itM4627s3.hasNext()) {
                                Integer num2 = (Integer) itM4627s3.next();
                                do5Var6.m4630v(num2.intValue() + iM4628t4, this.m4629u(num2.intValue()));
                            }
                            treeMap.clear();
                            itM4627s4 = do5Var6.m4627s();
                            while (itM4627s4.hasNext()) {
                                Integer num3 = (Integer) itM4627s4.next();
                                this.m4630v(num3.intValue(), do5Var6.m4629u(num3.intValue()));
                            }
                        }
                        return new xo5(Double.valueOf(this.m4628t()));
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 107868:
                    if (str.equals("map")) {
                        w76.m12154a("map", 1, arrayList);
                        aq5VarM13122t8 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        if (aq5VarM13122t8 instanceof vp5) {
                            return this.m4628t() == 0 ? new do5() : w76.m12157d(this, r36Var, (vp5) aq5VarM13122t8, null, null);
                        }
                        C1077qn.m9987m("Callback should be a method");
                        return null;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        w76.m12154a("pop", 0, arrayList);
                        iM4628t5 = this.m4628t();
                        if (iM4628t5 != 0) {
                            int i12 = iM4628t5 - 1;
                            aq5 aq5VarM4629u = this.m4629u(i12);
                            this.m4632x(i12);
                            return aq5VarM4629u;
                        }
                        return aq5VarM13122t;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        w76.m12158e("join", 1, arrayList);
                        if (this.m4628t() == 0) {
                            return aq5.f14788up;
                        }
                        if (arrayList.isEmpty()) {
                            strMo3117h = ",";
                        } else {
                            aq5VarM13122t9 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                            if (!(aq5VarM13122t9 instanceof rp5) || (aq5VarM13122t9 instanceof vq5)) {
                                strMo3117h = "";
                            } else {
                                strMo3117h = aq5VarM13122t9.mo3117h();
                            }
                        }
                        return new sq5(this.m4633y(strMo3117h));
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList.isEmpty()) {
                            size3 = arrayList.size();
                            i6 = 0;
                            while (i6 < size3) {
                                Object obj5 = arrayList.get(i6);
                                i6++;
                                this.m4630v(this.m4628t(), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) obj5));
                            }
                        }
                        return new xo5(Double.valueOf(this.m4628t()));
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        w76.m12154a("some", 1, arrayList);
                        aq5VarM13122t10 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        if (aq5VarM13122t10 instanceof dp5) {
                            C1077qn.m9987m("Callback should be a method");
                            return null;
                        }
                        if (this.m4628t() != 0) {
                            dp5 dp5Var2 = (dp5) aq5VarM13122t10;
                            itM4627s5 = this.m4627s();
                            while (itM4627s5.hasNext()) {
                                iIntValue2 = ((Integer) itM4627s5.next()).intValue();
                                if (!this.m4631w(iIntValue2) && dp5Var2.mo4517f(r36Var, Arrays.asList(this.m4629u(iIntValue2), new xo5(Double.valueOf(iIntValue2)), this)).mo3116a().booleanValue()) {
                                    return aq5.f14786sp;
                                }
                            }
                        }
                        return aq5.f14787tp;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str3)) {
                        w76.m12158e(str3, 1, arrayList);
                        if (this.m4628t() >= 2) {
                            List listM4626g = this.m4626g();
                            if (arrayList.isEmpty()) {
                                dp5Var = null;
                            } else {
                                aq5VarM13122t11 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                                if (aq5VarM13122t11 instanceof dp5) {
                                    C1077qn.m9987m("Comparator should be a method");
                                    return null;
                                }
                                dp5Var = (dp5) aq5VarM13122t11;
                            }
                            or5 or5Var = new or5();
                            or5Var.f26995a = dp5Var;
                            or5Var.f26996b = r36Var;
                            VarHandle.storeStoreFence();
                            Collections.sort(listM4626g, or5Var);
                            treeMap.clear();
                            arrayList2 = (ArrayList) listM4626g;
                            size4 = arrayList2.size();
                            i7 = 0;
                            i8 = 0;
                            while (i7 < size4) {
                                Object obj6 = arrayList2.get(i7);
                                i7++;
                                this.m4630v(i8, (aq5) obj6);
                                i8++;
                            }
                        }
                        return this;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        w76.m12154a("every", 1, arrayList);
                        aq5VarM13122t12 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        if (aq5VarM13122t12 instanceof vp5) {
                            C1077qn.m9987m("Callback should be a method");
                            return null;
                        }
                        if (this.m4628t() != 0) {
                            break;
                        }
                        return aq5.f14786sp;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        w76.m12154a("shift", 0, arrayList);
                        if (this.m4628t() != 0) {
                            aq5 aq5VarM4629u2 = this.m4629u(0);
                            this.m4632x(0);
                            return aq5VarM4629u2;
                        }
                        return aq5VarM13122t;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        w76.m12158e("slice", 2, arrayList);
                        if (arrayList.isEmpty()) {
                            return this.mo3121r();
                        }
                        dM4628t2 = this.m4628t();
                        dM12163j2 = w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue());
                        if (dM12163j2 < 0.0d) {
                            dMin = Math.max(dM12163j2 + dM4628t2, 0.0d);
                        } else {
                            dMin = Math.min(dM12163j2, dM4628t2);
                        }
                        if (arrayList.size() == 2) {
                            dM12163j3 = w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue());
                            if (dM12163j3 < 0.0d) {
                                dM4628t2 = Math.max(dM4628t2 + dM12163j3, 0.0d);
                            } else {
                                dM4628t2 = Math.min(dM4628t2, dM12163j3);
                            }
                        }
                        do5Var7 = new do5();
                        for (i9 = (int) dMin; i9 < dM4628t2; i9++) {
                            do5Var7.m4630v(do5Var7.m4628t(), this.m4629u(i9));
                        }
                        return do5Var7;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return w76.m12155b(this, r36Var, arrayList, false);
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        w76.m12154a("reverse", 0, arrayList);
                        iM4628t6 = this.m4628t();
                        if (iM4628t6 != 0) {
                            for (i10 = 0; i10 < iM4628t6 / 2; i10++) {
                                if (this.m4631w(i10)) {
                                    aq5 aq5VarM4629u3 = this.m4629u(i10);
                                    this.m4630v(i10, null);
                                    i11 = (iM4628t6 - 1) - i10;
                                    if (this.m4631w(i11)) {
                                        this.m4630v(i10, this.m4629u(i11));
                                    }
                                    this.m4630v(i11, aq5VarM4629u3);
                                }
                            }
                        }
                        return this;
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        w76.m12158e("indexOf", 2, arrayList);
                        if (!arrayList.isEmpty()) {
                            aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        }
                        aq5 aq5Var4 = aq5VarM13122t;
                        if (arrayList.size() > 1) {
                            dM12163j4 = w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue());
                            if (dM12163j4 >= this.m4628t()) {
                                return new xo5(dValueOf);
                            }
                            if (dM12163j4 < 0.0d) {
                                dM4628t = ((double) this.m4628t()) + dM12163j4;
                            } else {
                                dM4628t = dM12163j4;
                            }
                        }
                        itM4627s6 = this.m4627s();
                        while (itM4627s6.hasNext()) {
                            int iIntValue3 = ((Integer) itM4627s6.next()).intValue();
                            d = iIntValue3;
                            if (d < dM4628t && w76.m12161h(this.m4629u(iIntValue3), aq5Var4)) {
                                return new xo5(Double.valueOf(d));
                            }
                        }
                        return new xo5(dValueOf);
                    }
                    C1077qn.m9987m("Command not supported");
                    return null;
                default:
                    C1077qn.m9987m("Command not supported");
                    return null;
            }
        }
        str2 = "filter";
        obj = "unshift";
        str3 = "sort";
        obj2 = "reduce";
        dValueOf = Double.valueOf(-1.0d);
        iHashCode = str.hashCode();
        TreeMap treeMap5 = this.f17247a;
        aq5VarM13122t = aq5.f14781np;
        treeMap = treeMap5;
        dM4628t = 0.0d;
        switch (iHashCode) {
            case -1776922004:
                str4 = str7;
                if (str.equals(str4)) {
                    w76.m12154a(str4, 0, arrayList);
                    return new sq5(this.m4633y(","));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    do5Var = (do5) this.mo3121r();
                    if (!arrayList.isEmpty()) {
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            Object obj7 = arrayList.get(i);
                            i++;
                            aq5VarM13122t2 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) obj7);
                            if (!(aq5VarM13122t2 instanceof po5)) {
                                C1077qn.m9989o("Failed evaluation of arguments");
                                return null;
                            }
                            iM4628t = do5Var.m4628t();
                            if (aq5VarM13122t2 instanceof do5) {
                                do5Var2 = (do5) aq5VarM13122t2;
                                itM4627s = do5Var2.m4627s();
                                while (itM4627s.hasNext()) {
                                    Integer num4 = (Integer) itM4627s.next();
                                    do5Var.m4630v(num4.intValue() + iM4628t, do5Var2.m4629u(num4.intValue()));
                                }
                            } else {
                                do5Var.m4630v(iM4628t, aq5VarM13122t2);
                            }
                        }
                    }
                    return do5Var;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -1274492040:
                str5 = str2;
                if (str.equals(str5)) {
                    w76.m12154a(str5, 1, arrayList);
                    aq5VarM13122t3 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    if (aq5VarM13122t3 instanceof vp5) {
                        C1077qn.m9987m("Callback should be a method");
                        return null;
                    }
                    if (treeMap.size() == 0) {
                        return new do5();
                    }
                    do5Var3 = (do5) this.mo3121r();
                    do5 do5VarM12157d2 = w76.m12157d(this, r36Var, (vp5) aq5VarM13122t3, null, Boolean.TRUE);
                    do5Var4 = new do5();
                    itM4627s2 = do5VarM12157d2.m4627s();
                    while (itM4627s2.hasNext()) {
                        do5Var4.m4630v(do5Var4.m4628t(), do5Var3.m4629u(((Integer) itM4627s2.next()).intValue()));
                    }
                    return do5Var4;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -934873754:
                if (str.equals(obj2)) {
                    return w76.m12155b(this, r36Var, arrayList, true);
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -895859076:
                if (str.equals(str9)) {
                    if (arrayList.isEmpty()) {
                        return new do5();
                    }
                    aq5 aq5Var5 = (aq5) arrayList.get(0);
                    yg3 yg3Var3 = (yg3) r36Var.f28986b;
                    yg3Var = (yg3) r36Var.f28986b;
                    iM12163j = (int) w76.m12163j(yg3Var3.m13122t(r36Var, aq5Var5).mo3119m().doubleValue());
                    if (iM12163j < 0) {
                        iM12163j = Math.max(0, this.m4628t() + iM12163j);
                    } else if (iM12163j > this.m4628t()) {
                        iM12163j = this.m4628t();
                    }
                    iM4628t2 = this.m4628t();
                    do5Var5 = new do5();
                    if (arrayList.size() > 1) {
                        iMax = Math.max(0, (int) w76.m12163j(yg3Var.m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue()));
                        if (iMax > 0) {
                            while (i4 < Math.min(iM4628t2, iM12163j + iMax)) {
                                do5Var5.m4630v(do5Var5.m4628t(), this.m4629u(iM12163j));
                                this.m4632x(iM12163j);
                            }
                        }
                        i2 = 2;
                        if (arrayList.size() > 2) {
                            while (i2 < arrayList.size()) {
                                aq5VarM13122t4 = yg3Var.m13122t(r36Var, (aq5) arrayList.get(i2));
                                if (!(aq5VarM13122t4 instanceof po5)) {
                                    C1077qn.m9987m("Failed to parse elements to add");
                                    return null;
                                }
                                i3 = (iM12163j + i2) - 2;
                                if (i3 >= 0) {
                                    qm5.m9913d(String.valueOf(i3).length() + 21, i3, "Invalid value index: ");
                                    return null;
                                }
                                if (i3 >= this.m4628t()) {
                                    this.m4630v(i3, aq5VarM13122t4);
                                    treeMap2 = treeMap;
                                } else {
                                    iIntValue = ((Integer) treeMap.lastKey()).intValue();
                                    while (iIntValue >= i3) {
                                        numValueOf = Integer.valueOf(iIntValue);
                                        treeMap3 = treeMap;
                                        aq5Var = (aq5) treeMap3.get(numValueOf);
                                        if (aq5Var != null) {
                                            this.m4630v(iIntValue + 1, aq5Var);
                                            treeMap3.remove(numValueOf);
                                        }
                                        iIntValue--;
                                        treeMap = treeMap3;
                                    }
                                    treeMap2 = treeMap;
                                    this.m4630v(i3, aq5VarM13122t4);
                                }
                                i2++;
                                treeMap = treeMap2;
                            }
                        }
                    } else {
                        while (iM12163j < iM4628t2) {
                            do5Var5.m4630v(do5Var5.m4628t(), this.m4629u(iM12163j));
                            this.m4630v(iM12163j, null);
                            iM12163j++;
                        }
                    }
                    return do5Var5;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -678635926:
                str6 = str8;
                if (str.equals(str6)) {
                    w76.m12154a(str6, 1, arrayList);
                    aq5VarM13122t5 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    if (aq5VarM13122t5 instanceof vp5) {
                        C1077qn.m9987m("Callback should be a method");
                        return null;
                    }
                    if (treeMap.size() != 0) {
                        w76.m12157d(this, r36Var, (vp5) aq5VarM13122t5, null, null);
                        return aq5VarM13122t;
                    }
                    return aq5VarM13122t;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    w76.m12158e("lastIndexOf", 2, arrayList);
                    if (!arrayList.isEmpty()) {
                        aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    }
                    aq5 aq5Var6 = aq5VarM13122t;
                    iM4628t3 = this.m4628t() - 1;
                    if (arrayList.size() > 1) {
                        aq5VarM13122t6 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                        if (Double.isNaN(aq5VarM13122t6.mo3119m().doubleValue())) {
                            dM12163j = this.m4628t() - 1;
                        } else {
                            dM12163j = w76.m12163j(aq5VarM13122t6.mo3119m().doubleValue());
                        }
                        if (dM12163j < 0.0d) {
                            dM12163j += (double) this.m4628t();
                        }
                    } else {
                        dM12163j = iM4628t3;
                    }
                    if (dM12163j < 0.0d) {
                        return new xo5(dValueOf);
                    }
                    while (iMin >= 0) {
                        if (!this.m4631w(iMin)) {
                        }
                    }
                    return new xo5(dValueOf);
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -277637751:
                if (str.equals(obj)) {
                    if (!arrayList.isEmpty()) {
                        do5Var6 = new do5();
                        size2 = arrayList.size();
                        i5 = 0;
                        while (i5 < size2) {
                            Object obj8 = arrayList.get(i5);
                            i5++;
                            aq5VarM13122t7 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) obj8);
                            if (!(aq5VarM13122t7 instanceof po5)) {
                                C1077qn.m9989o("Argument evaluation failed");
                                return null;
                            }
                            do5Var6.m4630v(do5Var6.m4628t(), aq5VarM13122t7);
                        }
                        iM4628t4 = do5Var6.m4628t();
                        itM4627s3 = this.m4627s();
                        while (itM4627s3.hasNext()) {
                            Integer num5 = (Integer) itM4627s3.next();
                            do5Var6.m4630v(num5.intValue() + iM4628t4, this.m4629u(num5.intValue()));
                        }
                        treeMap.clear();
                        itM4627s4 = do5Var6.m4627s();
                        while (itM4627s4.hasNext()) {
                            Integer num6 = (Integer) itM4627s4.next();
                            this.m4630v(num6.intValue(), do5Var6.m4629u(num6.intValue()));
                        }
                    }
                    return new xo5(Double.valueOf(this.m4628t()));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 107868:
                if (str.equals("map")) {
                    w76.m12154a("map", 1, arrayList);
                    aq5VarM13122t8 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    if (aq5VarM13122t8 instanceof vp5) {
                        if (this.m4628t() == 0) {
                        }
                    }
                    C1077qn.m9987m("Callback should be a method");
                    return null;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 111185:
                if (str.equals("pop")) {
                    w76.m12154a("pop", 0, arrayList);
                    iM4628t5 = this.m4628t();
                    if (iM4628t5 != 0) {
                        int i13 = iM4628t5 - 1;
                        aq5 aq5VarM4629u4 = this.m4629u(i13);
                        this.m4632x(i13);
                        return aq5VarM4629u4;
                    }
                    return aq5VarM13122t;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 3267882:
                if (str.equals("join")) {
                    w76.m12158e("join", 1, arrayList);
                    if (this.m4628t() == 0) {
                        return aq5.f14788up;
                    }
                    if (arrayList.isEmpty()) {
                        aq5VarM13122t9 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        if (aq5VarM13122t9 instanceof rp5) {
                            strMo3117h = "";
                        } else {
                            strMo3117h = "";
                        }
                    } else {
                        strMo3117h = ",";
                    }
                    return new sq5(this.m4633y(strMo3117h));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 3452698:
                if (str.equals("push")) {
                    if (!arrayList.isEmpty()) {
                        size3 = arrayList.size();
                        i6 = 0;
                        while (i6 < size3) {
                            Object obj9 = arrayList.get(i6);
                            i6++;
                            this.m4630v(this.m4628t(), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) obj9));
                        }
                    }
                    return new xo5(Double.valueOf(this.m4628t()));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 3536116:
                if (str.equals("some")) {
                    w76.m12154a("some", 1, arrayList);
                    aq5VarM13122t10 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    if (aq5VarM13122t10 instanceof dp5) {
                        C1077qn.m9987m("Callback should be a method");
                        return null;
                    }
                    if (this.m4628t() != 0) {
                        dp5 dp5Var3 = (dp5) aq5VarM13122t10;
                        itM4627s5 = this.m4627s();
                        while (itM4627s5.hasNext()) {
                            iIntValue2 = ((Integer) itM4627s5.next()).intValue();
                            if (!this.m4631w(iIntValue2)) {
                            }
                        }
                    }
                    return aq5.f14787tp;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 3536286:
                if (str.equals(str3)) {
                    w76.m12158e(str3, 1, arrayList);
                    if (this.m4628t() >= 2) {
                        List listM4626g2 = this.m4626g();
                        if (arrayList.isEmpty()) {
                            aq5VarM13122t11 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                            if (aq5VarM13122t11 instanceof dp5) {
                                C1077qn.m9987m("Comparator should be a method");
                                return null;
                            }
                            dp5Var = (dp5) aq5VarM13122t11;
                        } else {
                            dp5Var = null;
                        }
                        or5 or5Var2 = new or5();
                        or5Var2.f26995a = dp5Var;
                        or5Var2.f26996b = r36Var;
                        VarHandle.storeStoreFence();
                        Collections.sort(listM4626g2, or5Var2);
                        treeMap.clear();
                        arrayList2 = (ArrayList) listM4626g2;
                        size4 = arrayList2.size();
                        i7 = 0;
                        i8 = 0;
                        while (i7 < size4) {
                            Object obj10 = arrayList2.get(i7);
                            i7++;
                            this.m4630v(i8, (aq5) obj10);
                            i8++;
                        }
                    }
                    return this;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 96891675:
                if (str.equals("every")) {
                    w76.m12154a("every", 1, arrayList);
                    aq5VarM13122t12 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    if (aq5VarM13122t12 instanceof vp5) {
                        C1077qn.m9987m("Callback should be a method");
                        return null;
                    }
                    if (this.m4628t() != 0) {
                        break;
                    }
                    return aq5.f14786sp;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 109407362:
                if (str.equals("shift")) {
                    w76.m12154a("shift", 0, arrayList);
                    if (this.m4628t() != 0) {
                        aq5 aq5VarM4629u5 = this.m4629u(0);
                        this.m4632x(0);
                        return aq5VarM4629u5;
                    }
                    return aq5VarM13122t;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    w76.m12158e("slice", 2, arrayList);
                    if (arrayList.isEmpty()) {
                        return this.mo3121r();
                    }
                    dM4628t2 = this.m4628t();
                    dM12163j2 = w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue());
                    if (dM12163j2 < 0.0d) {
                        dMin = Math.max(dM12163j2 + dM4628t2, 0.0d);
                    } else {
                        dMin = Math.min(dM12163j2, dM4628t2);
                    }
                    if (arrayList.size() == 2) {
                        dM12163j3 = w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue());
                        if (dM12163j3 < 0.0d) {
                            dM4628t2 = Math.max(dM4628t2 + dM12163j3, 0.0d);
                        } else {
                            dM4628t2 = Math.min(dM4628t2, dM12163j3);
                        }
                    }
                    do5Var7 = new do5();
                    while (i9 < dM4628t2) {
                        do5Var7.m4630v(do5Var7.m4628t(), this.m4629u(i9));
                    }
                    return do5Var7;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 965561430:
                if (str.equals("reduceRight")) {
                    return w76.m12155b(this, r36Var, arrayList, false);
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 1099846370:
                if (str.equals("reverse")) {
                    w76.m12154a("reverse", 0, arrayList);
                    iM4628t6 = this.m4628t();
                    if (iM4628t6 != 0) {
                        while (i10 < iM4628t6 / 2) {
                            if (this.m4631w(i10)) {
                                aq5 aq5VarM4629u6 = this.m4629u(i10);
                                this.m4630v(i10, null);
                                i11 = (iM4628t6 - 1) - i10;
                                if (this.m4631w(i11)) {
                                    this.m4630v(i10, this.m4629u(i11));
                                }
                                this.m4630v(i11, aq5VarM4629u6);
                            }
                        }
                    }
                    return this;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    w76.m12158e("indexOf", 2, arrayList);
                    if (!arrayList.isEmpty()) {
                        aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    }
                    aq5 aq5Var7 = aq5VarM13122t;
                    if (arrayList.size() > 1) {
                        dM12163j4 = w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue());
                        if (dM12163j4 >= this.m4628t()) {
                            return new xo5(dValueOf);
                        }
                        if (dM12163j4 < 0.0d) {
                            dM4628t = ((double) this.m4628t()) + dM12163j4;
                        } else {
                            dM4628t = dM12163j4;
                        }
                    }
                    itM4627s6 = this.m4627s();
                    while (itM4627s6.hasNext()) {
                        int iIntValue4 = ((Integer) itM4627s6.next()).intValue();
                        d = iIntValue4;
                        if (d < dM4628t) {
                        }
                    }
                    return new xo5(dValueOf);
                }
                C1077qn.m9987m("Command not supported");
                return null;
            default:
                C1077qn.m9987m("Command not supported");
                return null;
        }
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: r */
    public final aq5 mo3121r() {
        do5 do5Var = new do5();
        for (Map.Entry entry : this.f17247a.entrySet()) {
            boolean z = entry.getValue() instanceof ip5;
            TreeMap treeMap = do5Var.f17247a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (aq5) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((aq5) entry.getValue()).mo3121r());
            }
        }
        return do5Var;
    }

    /* JADX INFO: renamed from: s */
    public final Iterator m4627s() {
        return this.f17247a.keySet().iterator();
    }

    /* JADX INFO: renamed from: t */
    public final int m4628t() {
        TreeMap treeMap = this.f17247a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return m4633y(",");
    }

    /* JADX INFO: renamed from: u */
    public final aq5 m4629u(int i) {
        aq5 aq5Var;
        if (i < m4628t()) {
            return (!m4631w(i) || (aq5Var = (aq5) this.f17247a.get(Integer.valueOf(i))) == null) ? aq5.f14781np : aq5Var;
        }
        xy4.m12792u("Attempting to get element outside of current array");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m4630v(int i, aq5 aq5Var) {
        if (i > 32468) {
            C1077qn.m9989o("Array too large");
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        TreeMap treeMap = this.f17247a;
        if (aq5Var == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), aq5Var);
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4631w(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f17247a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: x */
    public final void m4632x(int i) {
        TreeMap treeMap = this.f17247a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, aq5.f14781np);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            aq5 aq5Var = (aq5) treeMap.get(numValueOf2);
            if (aq5Var != null) {
                treeMap.put(Integer.valueOf(i - 1), aq5Var);
                treeMap.remove(numValueOf2);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final String m4633y(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f17247a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= m4628t()) {
                    break;
                }
                aq5 aq5VarM4629u = m4629u(i);
                sb.append(str2);
                if (!(aq5VarM4629u instanceof vq5) && !(aq5VarM4629u instanceof rp5)) {
                    sb.append(aq5VarM4629u.mo3117h());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public do5() {
        this.f17247a = new TreeMap();
        this.f17248b = new TreeMap();
    }
}
