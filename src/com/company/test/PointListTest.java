package com.company.test;

import com.company.Pair.Pair;
import com.company.Pair.PointList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;
import java.util.Iterator;

class PointListTest {

    @Test
    void testPairIterator() {
        PointList<Point2D.Double> trianglePoints = new PointList<>();
        trianglePoints.add(new Point2D.Double(2, 1));
        trianglePoints.add(new Point2D.Double(2, 6));
        trianglePoints.add(new Point2D.Double(7, 1));


        Iterator<Pair<Point2D.Double>> iterator = trianglePoints.getPairIterator();
        Pair<Point2D.Double> currentPair = iterator.next();
        Assertions.assertEquals(currentPair.getFirstElementOfPair(), trianglePoints.get(0));
        Assertions.assertEquals(currentPair.getSecondElementOfPair(), trianglePoints.get(1));
        System.out.println(currentPair);

        currentPair = iterator.next();
        Assertions.assertEquals(currentPair.getFirstElementOfPair(), trianglePoints.get(1));
        Assertions.assertEquals(currentPair.getSecondElementOfPair(), trianglePoints.get(2));
        System.out.println(currentPair);

        currentPair = iterator.next();
        Assertions.assertEquals(currentPair.getFirstElementOfPair(), trianglePoints.get(2));
        Assertions.assertEquals(currentPair.getSecondElementOfPair(), trianglePoints.get(0));
        System.out.println(currentPair);
    }

}