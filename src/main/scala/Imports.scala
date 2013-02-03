/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                                                                                               *
 *  Copyright © 2012-2013 Christian Krause                                                       *
 *                                                                                               *
 *  Christian Krause <kizkizzbangbang@googlemail.com>                                            *
 *                                                                                               *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                                                                                               *
 *  This file is part of 'scala-chart'.                                                          *
 *                                                                                               *
 *  This project is free software: you can redistribute it and/or modify it under the terms      *
 *  of the GNU Lesser General Public License as published by the Free Software Foundation,       *
 *  either version 3 of the License, or any later version.                                       *
 *                                                                                               *
 *  This project is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;    *
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.    *
 *  See the GNU Lesser General Public License for more details.                                  *
 *                                                                                               *
 *  You should have received a copy of the GNU Lesser General Public License along with this     *
 *  project. If not, see <http://www.gnu.org/licenses/>.                                         *
 *                                                                                               *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


package scalax.chart

object Imports extends Imports
object TypeImports extends TypeImports
object StaticForwarderImports extends StaticForwarderImports

trait Imports extends TypeImports with StaticForwarderImports

trait TypeImports {
  type Orientation = scala.swing.Orientation.Value

  type PieDataset = org.jfree.data.general.PieDataset
  type XYDataset = org.jfree.data.xy.XYDataset

  type MultiplePiePlot = org.jfree.chart.plot.MultiplePiePlot
  type PiePlot = org.jfree.chart.plot.PiePlot
  type XYPlot = org.jfree.chart.plot.XYPlot

  type PieSectionLabelGenerator = (PieDataset,Comparable[_]) ⇒ String
  type PieToolTipGenerator = (PieDataset,Comparable[_]) ⇒ String
  type XYItemLabelGenerator = (XYDataset,Int,Int) ⇒ String
  type XYToolTipGenerator = (XYDataset,Int,Int) ⇒ String
}

trait StaticForwarderImports {
  val Orientation = scala.swing.Orientation
}
